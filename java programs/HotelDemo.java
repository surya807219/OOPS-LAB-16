class Hotel {
    void bookRoom(String name) {
        System.out.println(name + " booked a Standard Room.");
    }
    void bookRoom(String name, int nights) {
        System.out.println(name + " booked a room for " + nights + " nights.");
    }
    void bookRoom(String name, int nights, String roomType) {
        System.out.println(name + " booked a " + roomType + " for " + nights + " nights.");
    }
}

public class HotelDemo {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.bookRoom("Alice");
        hotel.bookRoom("Bob", 3);
        hotel.bookRoom("Charlie", 5, "Deluxe Room");
    }
}
