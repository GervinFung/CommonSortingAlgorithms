package app;

public class CountingSort extends AbstractSort{

    private int findMax(final int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            final int element = arr[i];
            if (element < 0) {
                throw new IllegalArgumentException("This CountingSort implementation only support 0 to N positive numbers.");
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private int[] countNumberOfElements(final int[] arr) {
        final int[] count = new int[this.findMax(arr) + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        return count;
    }

    @Override
    protected int[] sort(final int[] arr) {
        int index = 0;
        final int[] count = this.countNumberOfElements(arr);
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
                this.printSorted(arr);
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Counting Sort";
    }
}
