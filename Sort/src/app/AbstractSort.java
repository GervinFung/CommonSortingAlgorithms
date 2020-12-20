package app;

public abstract class AbstractSort {

    private final int[] arr = {75, 44, 21, 84, 92, 50, 34, 68, 3, 11, 3, 0};

    protected final int[] getArray() {
        return this.arr;
    }

    protected void swap(final int[] arr, final int i, final int j) {
        final int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        this.printSorted(arr);
    }

    protected void printSorted(final int[] arr) {
        for (final int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    protected void displaySortMethodName() {
        System.out.println(this.toString());
    }

    protected abstract int[] sort(final int[] arr);
}
