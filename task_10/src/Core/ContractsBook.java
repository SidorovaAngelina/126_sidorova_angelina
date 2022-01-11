package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ContractsBook {
    private int PaymentContCount;
    private HashMap<String, Contract> data;
    public ContractsBook() {
        data = new HashMap<>();
        PaymentContCount = 0;
    }
    public void addCont(String number, String date) {
        StringBuilder error = new StringBuilder();
        if (number == null) {
            error.append("Number can''t be null\n");
        }
        if (date == null) {
            error.append("Date can't be null\n");
        }
        if (!error.isEmpty()) {
            throw new IllegalArgumentException(error.toString());
        }
        if (!data.containsKey(number)) {
            data.put(number, new Contract(date));
            System.out.println("The contract is registered!");
        }
    }
    public int getContCount() {
        return data.size();
    }
    public static ContractsBook create() {
        return new ContractsBook();
    }
    public HashMap<String, Contract> getConts() {
        return data;
    }
    public void registerPaymentCont(int sum, int paymentContNumber, String contNumber, TypeOfPaymentCont type, String date) {
        StringBuilder error = new StringBuilder();
        if(contNumber == null){
            error.append("Number can't be null\n");
        }
        if(date == null){
            error.append("Date can't be null\n");
        }
        if (sum < 0) {
            error.append("Sum is positive\n");
        }
        if (paymentContNumber < 0) {
            error.append("Number of payment contract is positive\n");
        }
        if (!error.isEmpty()) {
            throw new IllegalArgumentException(error.toString());
        } else {
            data.get(contNumber).registerPaymentDoc(sum, paymentContNumber, type, date);
            PaymentContCount++;
            System.out.println("Created successfully!");

        }
    }
    public List<Integer> getAllPayments() {
        List<Integer> payments = new ArrayList();
        for (Contract contract : data.values()) {
            for (PaymentCont paymentCont : contract.getPaymentContracts().values())
                payments.add(paymentCont.getSum());
        }

        return payments;
    }
    public void deletePayment(String contNumber, int paymentContNumber, String paymentContDate) {
        data.get(contNumber).getPaymentContracts().remove(paymentContNumber);
    }







    public void commandList(){
        System.out.println("1 - adding a contract");
        System.out.println("2 - adding payment contract");
        System.out.println("3 - calculation of the sum of all payments of the contract with the specified number");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        run(command);
    }
    public void run(String command){
        ContractsBook.create();
        Scanner sc = new Scanner(System.in);
        switch (command) {

            case "1":
                System.out.println("Enter number of the contract");
                String number = sc.nextLine();
                System.out.println("Enter the date");
                String date = sc.nextLine();
                addCont(number, date);
                commandList();

            case "2":
                System.out.println("Enter number of the contract");
                String numberDoc = sc.nextLine();
                System.out.println("Enter the date");
                String datePay = sc.nextLine();
                System.out.println("Enter the sum");
                int sum = sc.nextInt();
                System.out.println("Enter the number");
                int numberPay = sc.nextInt();
                System.out.println("Enter 1 if BankOrder, enter 2 if PaymentOrder ");
                int type = sc.nextInt();
                if(type==1) registerPaymentCont(sum, numberPay, numberDoc, TypeOfPaymentCont.BankOrder, datePay);
                else if(type==2)  registerPaymentCont(sum, numberPay, numberDoc, TypeOfPaymentCont.PaymentOrder,  datePay);
                else System.out.println("try again(");
                commandList();

            case "3":
                System.out.println("Enter the number");
                String contNumber = sc.nextLine();
                System.out.println(getConts().get(contNumber).getSumOfPayments());
                commandList();
            default:
                System.out.println("Try again(");
        }

    }

}
