package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
            error.append("Number can't be null\n");
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
            for (PaymentCont paymentCont : contract.getPaymentDocuments().values())
                payments.add(paymentCont.getSum());
        }

        return payments;
    }

}
