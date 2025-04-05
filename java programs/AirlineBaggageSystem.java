class Baggage {
    private String baggageID;
    private double weight;
    
    public Baggage(String baggageID, double weight) { 
        this.baggageID = baggageID; 
        setWeight(weight); 
    }
    
    public String getBaggageID() { return baggageID; }
    
    public double getWeight() { return weight; }
    
    public void setWeight(double weight) { 
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight! Cannot be negative.");
        }
    }
    
    public void displayBaggageDetails() {
        System.out.println("Baggage ID: " + baggageID);
        System.out.println("Weight: " + weight + " kg");
    }
}

public class AirlineBaggageSystem {
    public static void main(String[] args) {
        Baggage bag1 = new Baggage("BAG123", 25.5);
        bag1.displayBaggageDetails();
        
        bag1.setWeight(-5); 
        bag1.setWeight(30); 
        bag1.displayBaggageDetails();
    }
}
