package Tests;

import org.junit.*;
import Core.*;

import java.util.ArrayList;
import java.util.List;


public class ContractsBookTests extends Assert {
    @Test
    public void create_CreateEmptyContractsBook_ContCountEqualsZero() {
        ContractsBook contractsBook = ContractsBook.create();
        assertEquals(0, contractsBook.getContCount());
    }


    @Test
    public void addCont_addContWithNumberAndDate_ContCountEqualsOne() {
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number", "date");
        assertEquals(1, contractsBook.getContCount());
    }


    @Test
    public void registerPaymentCont_registerPaymentContWithoutData_PaymentContCountEqualsZero() {
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number", "date");
        assertEquals(0, contractsBook.getConts().get("number").getPaymentContCount());
    }

    @Test
    public void registerPaymentCont_registerPaymentContWithData_PaymentContCountEqualsOne() {
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number", "date");
        contractsBook.registerPaymentCont(100000, 1, "number", TypeOfPaymentCont.BankOrder, "20010101");
        assertEquals(1, contractsBook.getConts().get("number").getPaymentContCount());
    }

    @Test
    public void registerPaymentDoc_registerPayDocWithData_PaymentDocCountEqualsThree() {
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number", "date");
        contractsBook.registerPaymentCont(100000, 1, "number", TypeOfPaymentCont.PaymentOrder, "20000709");
        contractsBook.registerPaymentCont(200000, 2, "number", TypeOfPaymentCont.PaymentOrder, "20201220");
        contractsBook.registerPaymentCont(300000, 3, "number", TypeOfPaymentCont.BankOrder, "20050505");
        assertEquals(3, contractsBook.getConts().get("number").getPaymentContCount());
    }
}