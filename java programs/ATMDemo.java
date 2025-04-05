class ATM {
    void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount);
    }
    void withdraw(double amount, int pin) {
        System.out.println("Withdrawing $" + amount + " using PIN: " + pin);
    }
    void withdraw(double amount, int pin, String accountType) {
        System.out.println("Withdrawing $" + amount + " from " + accountType + " account using PIN: " + pin);
    }
}
public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.withdraw(500);
        atm.withdraw(1000, 1234);
        atm.withdraw(2000, 5678, "Savings");
    }
}
