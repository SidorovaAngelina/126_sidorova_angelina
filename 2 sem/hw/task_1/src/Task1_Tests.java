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
}
