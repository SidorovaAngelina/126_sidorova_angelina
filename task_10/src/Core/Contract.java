package Core;

public class Contract {
    private int contractsCount;
    private Contract(){
        contractsCount = 0;
    }
    public void addContract(String number, String date){
        contractsCount++;

    }

    public int getContractsCount(){
        return contractsCount;
    }

    public static Contract create(){
        return new Contract();
    }
}
