package Core;

public class Contracts {
    private int contractsCount;
    private Contracts(){
        contractsCount = 0;
    }
    public void addContract(String number, String date){
        if(number==null && date==null)
            throw new IllegalArgumentException("Number can't be null, Date can't be null");
        if(number==null)
            throw new IllegalArgumentException("Number can't be null");
        if(date==null)
            throw new IllegalArgumentException("Date can't be null");
        contractsCount++;
    }

    public int getContractsCount(){
        return contractsCount;
    }

    public static Contracts create(){
        return new Contracts();
    }
}
