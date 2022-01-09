package Tests;

import org.junit.*;
import Core.*;

import java.util.Locale;


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
    @Test
    public void addContract_AddContractsWithNullNumber_ThrowsException() {
        Contract contract = Contract.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract(null, "date"));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullDate_ThrowsException() {
        Contract contract = Contract.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract("number", null));
        assertTrue(exc.getMessage().toLowerCase().contains("date can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullNumberAndNullDate_ThrowsException() {
        Contract contract = Contract.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contract.addContract(null, null));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null") &&
                        exc.getMessage().toLowerCase().contains("date can't be null"));
    }
}

