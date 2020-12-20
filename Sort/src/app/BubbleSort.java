package app;

public final class BubbleSort extends AbstractSort {
    @Override
    protected int[] sort(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    this.swap(arr, j + 1, j);
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Bubble Sort";
    }
}