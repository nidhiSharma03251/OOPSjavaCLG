// package Assignment3.Q5.OnlinePayment;

interface UPIPayment{
    void payViaUPI(double amount);
}

interface CardPayment{
    void payViaCard(double amount);
}

class OnlinePayment implements UPIPayment, CardPayment{

    @Override
    public void payViaCard(double amount) {
        System.out.println("Processing Card payment........");
        System.out.println("Card payment done, of amount " +amount);
    }

    @Override
    public void payViaUPI(double amount){
        System.out.println("Processing UPI payment........");
        System.out.println("UPI Payment done, of amount " +amount);
    }
}


public class PaymentIntegrationGateway {
    public static void main(String[] args) {
        OnlinePayment pay = new OnlinePayment();

        pay.payViaCard(8000);
        pay.payViaUPI(70000);
    }    
}
