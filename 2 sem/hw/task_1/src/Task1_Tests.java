import org.junit.*;
import org.junit.Assert;

public class Task1_Tests extends Assert{

    @Test
    public void DynamicArray_createArray_ArrayCreated(){
        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        assertEquals(0,dynamicArray.getSize());
    }

    @Test
    public void get_getThirdFromArray_Correct(){
        DynamicArray<Integer> array = new DynamicArray<>(3);
        array.set(0, 3);
        array.set(1, 5);
        array.set(2, 7);
        assertEquals(7, array.get(2).intValue());
    }

    @Test
    public void resize_setNewPositiveSize_Correct(){
        DynamicArray<Integer> array = new DynamicArray<>(1);
        array.resize(3);
        assertEquals(3, array.getSize());
    }

    @Test
    public void resize_setNewSizeLessThanSize_WithoutChanges(){
        DynamicArray<Integer> array = new DynamicArray<>(6);
        array.resize(2);
        assertEquals(6, array.getSize());
    }

    @Test
    public void get_getElemWithIndexEqualsSize_ThrowsException(){
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
    public void set_setElemWithIndexEqualsSize_ThrowsException(){
        DynamicArray<Integer> array = new DynamicArray<>(3);
        try {
            array.set(3, 10);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void insert_NumbersWithIndexEqualsSize_ThrowsException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5, 10);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }

    @Test
    public void insert_insertElem_Correct(){
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
    public void popBack_popBackElemFromEmptyArray_ThrowsException(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    @Test
    public void remove_removeElemWithIndexEqualsSize_ThrowsException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(5);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }
    }
}
