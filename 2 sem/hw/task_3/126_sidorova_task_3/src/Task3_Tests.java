import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer> {
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void heapSort_HeapSortWithTHeSameElem_WithoutChanges() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2, 2, 2};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2, 2, 2}, data);
    }

    @Test
    public void heapSort_HeapSortIsSorted_WithoutChanges() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2, 3, 4};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2, 3, 4}, data);
    }

    @Test
    public void heapSort_HeapSortIsUnsorted_CorrectOrder() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2, 4, 3};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2, 3, 4}, data);
    }

    @Test
    public void heapSort_HeapSortWithNegativeElem_CorrectOrder() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2, 0, -3};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-3, 0, 2}, data);
    }

    @Test
    public void heapSort_AnotherUnsorted_CorrectOrder() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {3, 5, 1, 2, 4, 6};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, data);
    }

    @Test
    public void heapSort_HeapSortIsUnsortedWithSameElem_CorrectOrder() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {7, 3, 2, 6, 1, 4, 8, 5, 9, 0, 1};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }

    @Test
    public void heapSort_HeapSortIsUnsortedWithSameElemAndNegativeElem_CorrectOrder() {
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {7, -3, 2, 6, 1, 4, -8, 5, 9, 0, 1};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-8, -3, 0, 1, 1, 2, 4, 5, 6, 7, 9}, data);
    }


    @Test
    public void mergeSort_MergeSortWithTHeSameElem_WithoutChanges() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {2, 2, 2};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2, 2, 2}, data);
    }

    @Test
    public void mergeSort_MergeSortIsSorted_CorrectOrder() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {3, 4, 5};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 4, 5}, data);
    }

    @Test
    public void mergeSort_MergeSortIsUnsorted_CorrectOrder() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {3, 5, 4};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 4, 5}, data);
    }
    @Test
    public void mergeSort_MergeSortIsUnsortedWithMoreElem_CorrectOrder(){
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {9, 2, 3, 6, 1, 0, 8, 5, 4, 7};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void mergeSort_MergeSortIsUnsortedWithTheSameElem_CorrectOrder(){
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {0, 0, 1, 2, 2, 1, 2};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 0, 1, 1, 2, 2, 2}, data);
    }
    @Test
    public void mergeSort_MergeSortWithNegativeElem_CorrectOrder() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {2, 0, -3};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-3, 0, 2}, data);
    }
    @Test
    public void MergeSort_MergeSortIsUnsortedWithSameElemAndNegativeElem_CorrectOrder() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] data = {7, -3, 2, 6, 1, 4, -8, 5, 9, 0, 1};
        mergeSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-8, -3, 0, 1, 1, 2, 4, 5, 6, 7, 9}, data);
    }




    @Test
    public void quickSort_QuickSortWithTHeSameElem_WithoutChanges() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {4, 4, 4};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{4, 4, 4}, data);
    }
    @Test
    public void quickSort_QuickSortIsSorted_WithoutChanges() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {5, 6, 7};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{5, 6, 7}, data);
    }
    @Test
    public void quickSort_QuickSortIsUnsorted_CorrectOrder() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = { 5, 7, 6};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{5,  6, 7}, data);
    }
    @Test
    public void quickSort_AnotherUnsorted_CorrectOrder() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {3, 5, 1, 2, 4, 6};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, data);
    }
    @Test
    public void quickSort_WithNegativeElem_CorrectOrder() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {2, 0, -3};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-3, 0 ,2}, data);
    }
    @Test
    public void QuickSort_quickSortIsUnsortedWithMoreElem_CorrectOrder(){
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {6, 7, 0, 9, 1, 3, 8, 5, 2, 4};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void quickSort_QuickSortIsUnsortedWithMoreElem_CorrectOrder(){
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {9, 2, 3, 6, 1, 0, 8, 5, 7, 4};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void quickSort_QuickSortIsUnsortedWithSameElemAndNegativeElem_CorrectOrder() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] data = {7, -3, 2, 6, 1, 4, -8, 5, 9, 0, 1};
        quickSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-8, -3, 0, 1, 1, 2, 4, 5, 6, 7, 9}, data);
    }



}
