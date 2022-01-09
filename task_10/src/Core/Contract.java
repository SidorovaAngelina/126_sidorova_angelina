package Core;

public class Contract {
    private int contractsCount;
    private Contract(){
        contractsCount = 0;
    }
    public void addContract(String number, String date){
        if(number==null)
            throw new IllegalArgumentException("Number can't be null");
        if(date==null)
            throw new IllegalArgumentException("Date can't be null");
        contractsCount++;
    }

    public int getContractsCount(){
        return contractsCount;
    }

    public static Contract create(){
        return new Contract();
    }
}
