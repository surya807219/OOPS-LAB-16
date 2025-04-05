interface Vehicle {
    void start();
}
class FourWheeler implements Vehicle {
    public void start() {
        System.out.println("Four-wheeler vehicle is starting.");
    }

    void wheels() {
        System.out.println("This vehicle has four wheels.");
    }
}
interface Electric {
    void batteryType();
}
class ElectricCar extends FourWheeler implements Electric {
    public void batteryType() {
        System.out.println("Electric car uses a lithium-ion battery.");
    }
}
public class HybridInheritanceExample2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();       
        tesla.wheels();     
        tesla.batteryType(); 
    }
}







