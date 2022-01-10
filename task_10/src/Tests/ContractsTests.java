package Tests;

import org.junit.*;
import Core.*;

import java.util.Locale;


public class ContractsTests extends Assert{
    @Test
    public void create_CreateEmptyContracts_ContractCountEqualsZero(){
        Contracts contracts = Contracts.create();
        assertEquals(0, contracts.getContractsCount());
    }

    @Test
    public void addContract_AddContractsWithNumberAndData_ContractsCountEqualsOne() {
        Contracts contracts = Contracts.create();
        contracts.addContract("number", "date");
        assertEquals(1, contracts.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNullNumber_ThrowsException() {
        Contracts contracts = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contracts.addContract(null, "date"));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullDate_ThrowsException() {
        Contracts contracts = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contracts.addContract("number", null));
        assertTrue(exc.getMessage().toLowerCase().contains("date can't be null"));
    }
    @Test
    public void addContract_AddContractsWithNullNumberAndNullDate_ThrowsException() {
        Contracts contracts = Contracts.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> contracts.addContract(null, null));
        assertTrue(exc.getMessage().toLowerCase().contains("number can't be null") &&
                exc.getMessage().toLowerCase().contains("date can't be null"));
    }
}
