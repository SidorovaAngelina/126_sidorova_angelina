import org.junit.*;
import org.junit.Assert;

public class Task2_Tests extends Assert {
    class TestComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }
    @Test
    public void bubbleSort_BubbleSortIsSorted_ArrayCorrect(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] data = {1, 2, 3};
        bubbleSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, data);
    }
    @Test
    public void bubbleSort_BubbleSortIsUnsorted_CorrectOrder(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] data = {3, 7, 5};
        bubbleSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3, 5, 7}, data);
    }
    @Test
    public void bubbleSort_BubbleSortWithNegativeNumbInWrongOrder_CorrectOrder(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] data = {4,-7, 0};
        bubbleSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-7, 0, 4}, data);
    }
    @Test
    public void bubbleSort_BubbleSortWithSimilarNumb_CorrectOrder(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] data = {6, 6, 6};
        bubbleSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{6, 6, 6}, data);
    }




    @Test
    public void insertionSort_insertionSortWithThreeSortedElem_WithoutChanges(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] data={3,4,5};
        insertionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3,4,5}, data);
    }
    @Test
    public void insertionSort_insertionSortIsUnsortedWithThreeElem_CorrectOrder(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] data={5,4,3};
        insertionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3,4,5}, data);
    }
    @Test
    public void insertionSort_insertionSortIsUnsortedWithThreeNegativeElem_CorrectOrder(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] data = {4,-7,0};
        insertionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-7,0,4}, data);
    }
    @Test
    public void insertionSort_insertionSortWithSimilarNumb_CorrectOrder(){
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        Integer[] data = {6,6,6};
        insertionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{6,6,6}, data);
    }




    @Test
    public void selectionSort_SelectionSortIsSorted_CorrectOrder(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] data = {3,5,7};
        selectionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3,5,7}, data);
    }

    @Test
    public void selectionSort_SelectionIsUnsorted_CorrectOrder(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] data = {7,3};
        selectionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3,7}, data);
    }


    @Test
    public void selectionSort_SelectionSortWithTheSameNumb_CorrectOrder(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] data = {3,3,3};
        selectionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{3,3,3}, data);
    }

    @Test
    public void selectionSort_SelectionSortWithNegativeElem_CorrectOrder(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] data = {5, 0, -3};
        selectionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{-3, 0, 5}, data);
    }

    @Test
    public void selectionSort_SelectionSortWithMaxOnTheFirstPlace_CorrectOrder(){
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] data = {6,4,2};
        selectionSort.sort(data, new TestComparator());
        assertArrayEquals(new Integer[]{2,4,6}, data);
    }
}