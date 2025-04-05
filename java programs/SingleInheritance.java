import java.util.Scanner;


class Vehicle {
    String make;
    String model;


    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    
    public void stop() {
        System.out.println(make + " " + model + " is stopping.");
    }
}

class Car extends Vehicle {
        public Car(String make, String model) {
        super(make, model);
    }

   
    public void drive() {
        System.out.println(make + " " + model + " is now being driven.");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car Make: ");
        String make = scanner.nextLine();
        
        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        
        Car myCar = new Car(make, model);

      
        myCar.start();  
        myCar.drive(); 
        myCar.stop();   

        scanner.close();
    }
}
