package app;

public final class InsertionSort extends AbstractSort {
    @Override
    protected int[] sort(final int[] arr) {
        return this.insertionSort(arr, 0, arr.length);
    }

    protected int[] insertionSort(final int[] arr, final int begin, final int end) {
        for (int i = begin + 1; i < arr.length; i++) {
            int j = i - 1, x = i;
            while (arr[x] < arr[j]) {
                this.swap(arr, x, j);
                if (j > 0) {
                    x--;
                    j--;
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}