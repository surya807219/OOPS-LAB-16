interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light turned ON.");
    }

    public void turnOff() {
        System.out.println("Light turned OFF.");
    }
}

class Fan implements SmartDevice {
   
    public void turnOn() {
        System.out.println("Fan turned ON.");
    }

    public void turnOff() {
        System.out.println("Fan turned OFF.");
    }
}

public class InterfaceEx3 {
    public static void main(String[] args) {
        SmartDevice device1 = new Light();
        SmartDevice device2 = new Fan();

        device1.turnOn();
        device2.turnOff();
    }
}
