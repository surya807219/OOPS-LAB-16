class TrainTicket {
    private String passengerName;
    private int trainNumber;
    private int seatNumber;
    
    public TrainTicket(String passengerName, int trainNumber, int seatNumber) { 
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
    }
    
    public String getPassengerName() { return passengerName; }
    public int getTrainNumber() { return trainNumber; }
    public int getSeatNumber() { return seatNumber; }
    
    public void displayTicketDetails() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Seat Number: " + seatNumber);
    }
}
public class TrainReservationSystem {
    public static void main(String[] args) {
        TrainTicket ticket1 = new TrainTicket("Hari", 10123, 45);
        ticket1.displayTicketDetails();
    }
}
