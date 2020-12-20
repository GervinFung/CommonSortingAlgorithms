package app;

public final class TestSort {

    private static void beginSort(final AbstractSort sort) {
        sort.displaySortMethodName();
        sort.sort(sort.getArray());
        sort.printSorted(sort.getArray());
        System.out.println();
    }

    public static void main(final String[] args) {

        //Most applicable sorting algorithm
        beginSort(new TimSort());
        //When you need a stable, O(N log N) sort,
        beginSort(new MergeSort());
        //When you don't need a stable sort and you care more about worst case performance than average case performance
        beginSort(new HeapSort());
        // When you don't need a stable sort and average case performance matters more than worst case performance
        beginSort(new QuickSort());


        //When you're doing something quick and dirty
        beginSort(new SelectionSort());
        //When you're doing something quick and dirty
        beginSort(new BubbleSort());
        //When you're doing something quick and dirty
        beginSort(new ExchangeSort());

        //When N is guaranteed to be small, including as the base case of a quick sort or merge sort
        beginSort(new InsertionSort());
        //When you are sorting integers with a limited range and no negative numbers
        beginSort(new CountingSort());
    }
}
