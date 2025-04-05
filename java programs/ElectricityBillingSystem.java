class ElectricityBill {
    private int unitsConsumed;
    private static final double RATE_PER_UNIT = 5.0; 

    public ElectricityBill(int unitsConsumed) { 
        setUnitsConsumed(unitsConsumed);
    }
    
    public int getUnitsConsumed() { return unitsConsumed; }

    public void setUnitsConsumed(int unitsConsumed) { 
        if (unitsConsumed >= 0) {
            this.unitsConsumed = unitsConsumed;
        } else {
            System.out.println("Invalid units! Cannot be negative.");
        }
    }
    
    public double calculateBill() { 
        return unitsConsumed * RATE_PER_UNIT; 
    }
    
    public void displayBill() {
        System.out.println("Electricity Consumption: " + unitsConsumed + " units");
        System.out.println("Total Bill: $" + calculateBill());
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        ElectricityBill bill1 = new ElectricityBill(200);
        bill1.displayBill();
        
        bill1.setUnitsConsumed(-10); 
        bill1.setUnitsConsumed(300);
        bill1.displayBill();
    }
}
