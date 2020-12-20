package app;

public class HeapSort extends AbstractSort{

    @Override
    protected int[] sort(final int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            this.heap(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            this.swap(arr, 0, i);
            this.heap(arr, i, 0);
        }
        return arr;
    }
    
    private void heap(final int arr[], final int arrSize, final int root) {
        int largest = root;
        final int left = 2 * root + 1;
        final int right = 2 * root + 2;

        // If left child > root
        if (left < arrSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child > largest
        if (right < arrSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            int swap = arr[root];
            arr[root] = arr[largest];
            arr[largest] = swap;

            this.heap(arr, arrSize, largest);
        }
    }

    @Override
    public String toString() {
        return "Heap Sort";
    }
}