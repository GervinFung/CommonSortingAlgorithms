package app;

public class TimSort extends AbstractSort{

    private final InsertionSort insertionSort;
    private final MergeSort mergeSort;

    public TimSort() {
        this.insertionSort = new InsertionSort();
        this.mergeSort = new MergeSort();
    }

    private int determineMinRun(final int arrSize) {
        return (int) (Math.log(arrSize) / Math.log(2));
    }

    private int getMinRun(int n) {
        int r = 0;
        while (n >= 64) {
            r |= (n & 1);
            n >>= 1;
        }

        return n + r;
    }

    @Override
    protected int[] sort(final int[] arr) {

        final int minRun = this.getMinRun(this.determineMinRun(arr.length));
        final int arrSize = arr.length;

        for (int i = 0; i < arrSize; i += minRun) {
            this.insertionSort.insertionSort(arr, i, Math.min((i + 31), arrSize));
        }

        for (int size = minRun; size < arrSize; size = 2 * size) {

            for (int left = 0; left < arrSize; left += 2 * size) {

                final int mid = left + size - 1;
                final int right = Math.min((left + 2 * size - 1), (arrSize - 1));
 
                this.mergeSort.merge(arr, left, mid, right);
            } 
        } 
        return arr;
    }

    @Override
    public String toString() {
        return "Tim Sort";
    }
}