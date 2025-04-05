abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }
    abstract void processPayment();

    void paymentConfirmation() {
        System.out.println("Payment of $" + amount + " is confirmed.");
    }
}
class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    void processPayment() {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    PayPalPayment(double amount) {
        super(amount);
    }
    void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class AbstractEx3{
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(500);
        Payment p2 = new PayPalPayment(200);

        p1.processPayment();
        p1.paymentConfirmation();

        p2.processPayment();
        p2.paymentConfirmation();
    }
}
