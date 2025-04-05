interface FlightBooking {
    void bookTicket(String destination);
}
class Indigo implements FlightBooking {
    public void bookTicket(String destination) {
        System.out.println("Indigo flight booked to " + destination);
    }
}
class AirIndia implements FlightBooking {
    public void bookTicket(String destination) {
        System.out.println("Air India flight booked to " + destination);
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        FlightBooking f1 = new Indigo();
        FlightBooking f2 = new AirIndia();

        f1.bookTicket("New York");
        f2.bookTicket("London");
    }
}
