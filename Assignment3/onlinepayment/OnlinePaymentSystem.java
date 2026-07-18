package Assignment3.onlinepayment;

abstract class Payment {
    protected String transactionId;
    protected double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract void processPayment();
}


class CreditCardPayment extends Payment {

    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double fee = amount * 0.02; 
        double totalAmount = amount + fee;

        System.out.println("Credit Card Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Transaction Fee: ₹" + fee);
        System.out.println("Total Charged: ₹" + totalAmount);
    }
}


class PayPalPayment extends Payment {

    public PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    void processPayment() {
        double fee = amount * 0.03; 
        double totalAmount = amount + fee;

        System.out.println("PayPal Payment");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Transaction Fee (3%): ₹" + fee);
        System.out.println("Total Charged: ₹" + totalAmount);
    }
}

// Main Class
public class OnlinePaymentSystem {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("CC101", 5000);
        Payment p2 = new PayPalPayment("PP202", 5000);

        p1.processPayment();
        System.out.println();

        p2.processPayment();
    }
}