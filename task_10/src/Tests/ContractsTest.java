package Tests;

import org.junit.*;
import Core.*;
import java.util.ArrayList;
import java.util.List;


public class ContractsTest extends Assert{
    @Test
    public void create_CreateEmptyContracts_ContractsCountEqualsZero(){
        Contracts contracts = Contracts.create();
        assertEquals(0, contracts.getContractsCount());
    }

    @Test
    public void addContract_AddContractsWithNumberAndData_ContractsCountEqualsOne() {
        Contracts contract = Contracts.create();
        contract.addContract("number", "date");
        assertEquals(1, contract.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNullNumber_ThrowsException() {
        Contracts contract = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract(null, "date"));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullDate_ThrowsException() {
        Contracts contract = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract("number", null));
        assertTrue(exc.getMessage().toLowerCase().contains("date can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullNumberAndNullDate_ThrowsException() {
        Contracts contract = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract(null, null));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null") &&
                        exc.getMessage().toLowerCase().contains("date can't be null"));
    }
    @Test
    public void registerPayDoc_registerPayDoc_ContractsCountEqualsOne(){
        Contracts contract = Contracts.create();
        contract.addContract("1","20220101");
        Contracts.addPayDoc(10000, 1, PayDocType.PaymentOrder, "1", "20220101");
        assertEquals(1, сontract.getContracts().get("1").getPayDocCount());
    }
}

