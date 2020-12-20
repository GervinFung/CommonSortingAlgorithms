package app;

public final class ExchangeSort extends AbstractSort {
    @Override
    protected int[] sort(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    this.swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Exchange Sort";
    }
}