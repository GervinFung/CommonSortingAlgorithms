package app;

public final class MergeSort extends AbstractSort {

    private int[] mergeSort (final int[] arr, final int left, final int right) {
        if (left < right) {
            final int mid = (left + right) / 2;
            this.mergeSort(arr, left, mid);
            this.mergeSort(arr, mid + 1, right);
            this.merge(arr, left, mid, right);
        }
        return arr;
    }

    protected void merge(final int[] arr, final int left, final int mid, final int right) {
        final int[] leftArr = new int[mid - left + 2];
        final int[] rightArr = new int[right - mid + 1];

        for (int i = left; i <= mid; i++) {
            leftArr[i - left] = arr[i];
        }
        for (int i = mid + 1; i <= right; i++) {
            rightArr[i - mid - 1] = arr[i];
        }

        //For compariing to neighbor element
        leftArr[leftArr.length - 1] = Integer.MAX_VALUE;
        rightArr[rightArr.length - 1] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
        }
        this.printSorted(arr);
    }

    @Override
    protected int[] sort(final int[] arr) {
        return this.mergeSort(arr, 0, arr.length - 1);
    }

    @Override
    public String toString() {
        return "Merge Sort";
    }
}