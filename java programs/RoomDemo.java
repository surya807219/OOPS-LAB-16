class Room {
    double length, width;

    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class VolumeRoom extends Room {
    double height;

    public VolumeRoom(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

public class RoomDemo {
    public static void main(String args[]) {
      
        double length = 10.5;
        double width = 8.2;
        double height = 12.3;

        VolumeRoom room = new VolumeRoom(length, width, height);
        
        System.out.println("Room Area: " + room.calculateArea() + " square units");
        System.out.println("Room Volume: " + room.calculateVolume() + " cubic units");
    }
}
