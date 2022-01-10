package Core;

import javax.swing.text.Document;
import java.util.HashMap;

public class Contracts {
    private int ContractsCount;
    private HashMap<String, Document> data;

    public Contracts(){
        data = new HashMap<>();

    }

    private Contracts(){
        ContractsCount = 0;
    }
    public void addContract(String number, String date){
        StringBuilder error = new StringBuilder();
        if(number==null)
            error.append("Number can't be null\n");
        if(date==null)
            error.append("Date can't be null\n");
        if(!error.isEmpty())
            throw new IllegalArgumentException(error.toString());
        contractsCount++;
    }

    public void addPayDoc(int sum, int orderNumber, PayDocType paymentType, String contractNumber, String date){
        if (sum>0 && orderNumber>0 && String.valueOf(date).length()==8){

        }
    }

    public int getContractsCount(){
        return contractsCount;
    }

    public static Contracts create(){
        return new Contracts();
    }
    public HashMap<String, Document> getDocs(){
        return data;
    }



}
