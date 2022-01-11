package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContractsBook {
    private int contCount;

    private ContractsBook() {
        contCount = 0;
    }

    public int getContCount() {
        return contCount;
    }

    public static ContractsBook create() {
        return new ContractsBook();
    }

    public void addCont(String number, String date){
        if(number==null && date==null)
            throw new IllegalArgumentException("Number can't be null, Date can't be null");
        if(number==null)
            throw new IllegalArgumentException("Number can't be null");
        if(date==null)
            throw new IllegalArgumentException("Date can't be null");
        contCount++;
    }

}

