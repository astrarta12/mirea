package lab28;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
