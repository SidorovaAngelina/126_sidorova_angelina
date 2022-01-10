package Tests;

import org.junit.*;
import Core.*;
import java.util.ArrayList;
import java.util.List;

public class ContractTest extends Assert{
    @Test
    public void create_CreateContractsList_ContractsCountEqualsZero(){
        Contracts contracts = Contracts.create();
        assertEquals(0, Contracts.getContractsCount());
    }
}