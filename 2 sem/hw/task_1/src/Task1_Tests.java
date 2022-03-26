import org.junit.*;
import org.junit.Assert;

public class Task1_Tests extends Assert {

    @Test
    public void DynamicArray_createArray_ArrayCreated() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        assertEquals(0, dynamicArray.getSize());
    }

    @Test
    public void get_getThirdFromArray_Correct() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 3);
        array.set(1, 5);
        array.set(2, 7);
        assertEquals(7, array.get(2).intValue());
    }

    @Test
    public void resize_setNewPositiveSize_Correct() {
        DynamicArray<Integer> array = new DynamicArray<>(1);
        array.resize(3);
        assertEquals(3, array.getSize());
    }

    @Test
    public void resize_setNewSizeLessThanSize_WithoutChanges() {
        DynamicArray<Integer> array = new DynamicArray<>(6);
        array.resize(2);
        assertEquals(6, array.getSize());
    }

    @Test
    public void get_getElemWithIndexEqualsSize_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 2);
        array.set(1, 4);
        array.set(2, 6);
        try {
            array.get(3);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void set_setElemWithIndexEqualsSize_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<>(3);
        try {
            array.set(3, 10);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void insert_NumbersWithIndexEqualsSize_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5, 10);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void insert_insertElem_Correct() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 10);
        array.set(1, 15);
        array.set(2, 20);
        array.insert(2, 30);
        assertEquals(30, array.get(2).intValue());
        assertEquals(20, array.get(3).intValue());
    }

    @Test
    public void pushBack_pushBackElem_ElemCorrect() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.pushBack(10);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(10, array.get(10).intValue());
    }

    @Test
    public void popBack_popBackElemFromEmptyArray_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    @Test
    public void remove_removeElemWithIndexEqualsSize_ThrowsException() {
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(5);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    ////////////////////////////////////////////////////////////////////////////

    @Test
    public void getNext_getDataOfNextElem_ElemCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> firstElem = list.pushFront(1);
        Node<Integer> thirdElem = list.pushFront(3);
        Node<Integer> elem = new Node<Integer>(2, thirdElem, firstElem);
        Node<Integer> next = (Node<Integer>) elem.getNext();
        Node<Integer> prev = (Node<Integer>) elem.getPrev();
        assertEquals(3, next.getData().intValue());
        assertEquals(1, prev.getData().intValue());
    }

    //////////////////////////////////////////////////////////////////////////

    @Test
    public void isEmpty_checkListWithoutElem_isEmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertEquals(true, list.isEmpty());
    }
    @Test
    public void isEmpty_checkListWithElem_isEmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> elem = (Node<Integer>) list.pushBack(3);
        assertEquals(false, list.isEmpty());
    }
    @Test
    public void pushFront_pushToEmptyList_sizeEqualsOne(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        assertEquals(1, list.getSize());
    }
    @Test
    public void pushFront_pushToEmptyList_HeadAndTailCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(5, head.getData().intValue());
        assertEquals(5, tail.getData().intValue());
        assertEquals(head, tail);
    }
    @Test
    public void pushBack_pushToEmptyList_sizeEqualsOne(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(5);
        assertEquals(1, list.getSize());
    }
    @Test
    public void get_getElemByIndex_GetCorrectElem(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(5);
        list.pushBack(7);
        Node<Integer> elem = (Node<Integer>) list.get(1);
        assertEquals(7, elem.getData().intValue());
    }
    @Test
    public void get_getElemByIndexEqualsSize_ThrowsException(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        list.pushFront(7);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
    @Test
    public void pushFront_pushTwoElem_SizeEqualsTwo(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(15);
        list.pushFront(10);
        assertEquals(2, list.getSize());
    }
    @Test
    public void pushFront_pushThreeElem_HeadAndTailAreCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(5);
        list.pushFront(3);
        list.pushFront(7);
        Node<Integer> head = (Node<Integer>) list.getHead();
        Node<Integer> tail = (Node<Integer>) list.getTail();
        assertEquals(7, head.getData().intValue());
        assertEquals(5, tail.getData().intValue());
    }
    @Test
    public void remove_RemoveElemFromList_ListIsEmpty(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> Node = (Node<Integer>) list.pushBack(5);
        list.remove(Node);
        assertTrue(list.isEmpty());
    }
    @Test
    public void remove_RemoveElemFromList_ElemAreMoved(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        Node<Integer> ElemFirst = (Node<Integer>) list.pushBack(1);
        Node<Integer> ElemSecond = (Node<Integer>) list.pushBack(5);
        Node<Integer> ElemThird = (Node<Integer>) list.pushBack(7);
        list.remove(ElemFirst);
        Node<Integer> Head = (Node<Integer>) list.getHead();
        Node<Integer> Tail = (Node<Integer>) list.getTail();
        assertEquals(5, Head.getData().intValue());
        assertEquals(7, Tail.getData().intValue());
    }
    @Test
    public void insertListAfter_insertListAfterSecondElem_OrderIsCorrect(){
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushBack(10);
        Node<Integer> elem = (Node<Integer>) list1.pushBack(20);
        list1.pushBack(30);
        list1.pushBack(40);
        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushBack(50);
        list2.pushBack(60);
        list1.insertListAfter(list1.get(1), list2);
        Node<Integer> zero = (Node<Integer>) list1.get(0);
        Node<Integer> one = (Node<Integer>) list1.get(1);
        Node<Integer> two = (Node<Integer>) list1.get(2);
        Node<Integer> three = (Node<Integer>) list1.get(3);
        Node<Integer> four = (Node<Integer>) list1.get(4);
        Node<Integer> five = (Node<Integer>) list1.get(5);
        assertEquals(10, zero.getData().intValue());
        assertEquals(20, one.getData().intValue());
        assertEquals(50, two.getData().intValue());
        assertEquals(60, three.getData().intValue());
        assertEquals(30, four.getData().intValue());
        assertEquals(40, five.getData().intValue());
    }
}
