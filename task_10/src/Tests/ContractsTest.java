package Tests;

import org.junit.*;
import Core.*;


public class ContractsTest extends Assert{
    @Test
    public void create_CreateEmptyContracts_ContractCountEqualsZero(){
        Contract contract = Contract.create();
        assertEquals(0, contract.getContractsCount());
    }

    @Test
    public void addContract_AddContractsWithNumberAndData_ContractsCountEqualsOne() {
        Contract contract = Contract.create();
        contract.addContract("number", "date");
        assertEquals(1, contract.getContractsCount());
    }
}

