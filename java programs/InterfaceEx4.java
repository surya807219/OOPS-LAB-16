interface Discountable {
    void applyDiscount(double price);
}
class Electronics implements Discountable {
  
    public void applyDiscount(double price) {
        System.out.println("Final price after 10% discount: $" + (price - (price * 0.10)));
    }
}

class Clothing implements Discountable {
    public void applyDiscount(double price) {
        System.out.println("Final price after 20% discount: $" + (price - (price * 0.20)));
    }
}

public class InterfaceEx4 {
    public static void main(String[] args) {
        Discountable d1 = new Electronics();
        Discountable d2 = new Clothing();

        d1.applyDiscount(100);
        d2.applyDiscount(200);
    }
}
