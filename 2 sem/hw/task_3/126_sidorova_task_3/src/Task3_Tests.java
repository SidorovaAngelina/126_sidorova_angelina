import org.junit.Assert;
import org.junit.*;

public class Task3_Tests extends Assert {
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void heapSort_HeapSortWithTHeSameElem_WithoutChanges(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2,2,2};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer [] {2,2,2}, data);
    }
    @Test
    public void heapSort_HeapSortIsSorted_WithoutChanges(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2,3,4};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer [] {2,3,4}, data);
    }
    @Test
    public void heapSort_HeapSortIsUnsorted_CorrectOrder(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2,4,3};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer [] {2,3,4}, data);
    }
    @Test
    public void heapSort_HeapSortWithNegativeElem_CorrectOrder(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {2,0,-3};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer [] {-3,0,2}, data);
    }
    @Test
    public void heapSort_AnotherUnsorted_CorrectOrder(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {3, 5, 1, 2, 4, 6};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer [] {1,2,3,4,5, 6}, data);
    }
    @Test
    public void heapSort_HeapSortIsUnsortedWithSameElem_CorrectOrder(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {7, 3, 2, 6, 1, 4, 8, 5, 9, 0, 1};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, data);
    }
    @Test
    public void heapSort_HeapSortIsUnsortedWithSameElemAndNegativeElem_CorrectOrder(){
        HeapSort<Integer> heapSort = new HeapSort<>();
        Integer[] data = {7, -3, 2, 6, 1, 4, -8, 5, 9, 0, 1};
        heapSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-8, -3, 0, 1, 1, 2, 4, 5, 6, 7, 9}, data);
    }

}
