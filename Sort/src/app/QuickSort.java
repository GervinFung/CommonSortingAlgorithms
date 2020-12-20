package app;

public final class QuickSort extends AbstractSort {

    private int partition(final int[] arr, final int low, final int high) {
        final int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                this.swap(arr, j, i);
            }
        }
        i++;
        this.swap(arr, high,  i);
        return i;
    }

    private int[] quickSort(final int[] arr, final int low, final int high) {
        if (low < high) {
            final int j = this.partition(arr, low, high);
            this.quickSort(arr, low, j - 1);
            this.quickSort(arr, j + 1, high);
        }
        return arr;
    }

    @Override
    protected int[] sort(final int[] arr) {
        return this.quickSort(arr, 0, arr.length - 1);
    }

    @Override
    public String toString() {
        return "Quick Sort";
    }
}