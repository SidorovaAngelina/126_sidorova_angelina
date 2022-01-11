package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContractsBook {
    private int contCount;
    private ContractsBook(){
        contCount = 0;
    }
    public int getContCount(){
        return contCount;
    }
    public static ContractsBook create(){
        return new ContractsBook();
    }

}

