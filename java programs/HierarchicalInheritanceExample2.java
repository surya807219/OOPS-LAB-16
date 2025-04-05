class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}
public class HierarchicalInheritanceExample2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();  
        car.drive();  

        System.out.println();

        Bike bike = new Bike();
        bike.start(); 
        bike.ride(); 
    }
}












