package app;

public final class SelectionSort extends AbstractSort {
    @Override
    protected int[] sort(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE, index = 0;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = min;
            this.swap(arr, i, index);
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Selection Sort";
    }
}