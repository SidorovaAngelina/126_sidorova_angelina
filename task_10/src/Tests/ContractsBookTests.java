package Tests;

import org.junit.*;
import Core.*;

import java.util.ArrayList;
import java.util.List;


public class ContractsBookTests extends Assert {
    @Test
    public void create_CreateEmptyContBook_ContCountEqualsZero() {
        ContractsBook contractsBook = ContractsBook.create();
        assertEquals(0, contractsBook.getContCount());
    }
}