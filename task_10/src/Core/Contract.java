package Core;

public class Contract {
    private int contractsCount;
    private Contract(){
        contractsCount = 0;
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

    public int getContractsCount(){
        return contractsCount;
    }



    public static Contract create(){
        return new Contract();
    }
}
