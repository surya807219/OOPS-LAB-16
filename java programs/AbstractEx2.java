abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        System.out.println("Savings Account Interest: " + (balance * 0.04));
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }
    void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}

public class AbstractEx2{
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(1000);
        BankAccount acc2 = new CurrentAccount(5000);

        acc1.calculateInterest();
        acc2.calculateInterest();
        acc1.showBalance();
    }
}
