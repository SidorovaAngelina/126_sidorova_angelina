package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contract {
    private String date;
    private HashMap<Integer, PaymentCont> paymentConts;


    public Contract(String date){
        this.date = date;
        paymentConts = new HashMap<>();
    }
    public void registerPaymentDoc(int sum, int number, TypeOfPaymentCont type, String date){
        paymentConts.put(number,new PaymentCont(sum,type,date));
    }

    public int getPaymentContCount() {
        return paymentConts.size();
    }
    public HashMap<Integer, PaymentCont> getPaymentDocuments(){
        return paymentConts;
    }

}

