package Core;

public class PaymentCont {
    private int sum;
    private String date;
    private TypeOfPaymentCont type;

    public PaymentCont(int sum, TypeOfPaymentCont type, String date) {
        this.sum = sum;
        this.type=type;
        this.date = date;
    }
    public int getSum(){
        return sum;
    }
}


