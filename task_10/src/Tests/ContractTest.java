package Tests;

import org.junit.*;



public class ContractTest extends Assert{
    @Test
    public void create_CreateContractsList_ContractsCountEqualsZero(){
        Contract contract = Contract.create();
        assertEquals(0, Contract.getContractsCount());
    }
}
