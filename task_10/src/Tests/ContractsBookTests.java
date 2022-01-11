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
    public void registerPaymentCont_registerPaymentContWithData_PaymentContCountEqualsThree() {
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number", "date");
        contractsBook.registerPaymentCont(100000, 1, "number", TypeOfPaymentCont.PaymentOrder, "20000709");
        contractsBook.registerPaymentCont(200000, 2, "number", TypeOfPaymentCont.PaymentOrder, "20201220");
        contractsBook.registerPaymentCont(300000, 3, "number", TypeOfPaymentCont.BankOrder, "20050505");
        assertEquals(3, contractsBook.getConts().get("number").getPaymentContCount());
    }





    @Test
    public void getList_getListOfAllPayments_equalLists(){
        ContractsBook contractsBook = ContractsBook.create();
        contractsBook.addCont("number","date");
        contractsBook.registerPaymentCont(700000, 1, "number", TypeOfPaymentCont.PaymentOrder, "20000202");
        contractsBook.registerPaymentCont(100000, 2, "number", TypeOfPaymentCont.BankOrder, "20000202");
        contractsBook.registerPaymentCont(600000, 3, "number", TypeOfPaymentCont.PaymentOrder, "20000202");
        contractsBook.addCont("number2","date");
        contractsBook.registerPaymentCont(300000, 1, "number2", TypeOfPaymentCont.PaymentOrder, "20000202");
        contractsBook.registerPaymentCont(200000, 2, "number2", TypeOfPaymentCont.BankOrder, "20000202");
        contractsBook.registerPaymentCont(900000, 3, "number2", TypeOfPaymentCont.PaymentOrder, "20000202");

        List<Integer> paymentConts = new ArrayList();
        paymentConts.add(700000);
        paymentConts.add(100000);
        paymentConts.add(600000);
        paymentConts.add(300000);
        paymentConts.add(200000);
        paymentConts.add(900000);
        assertArrayEquals(paymentConts.toArray(), contractsBook.getAllPayments().toArray());
    }
}