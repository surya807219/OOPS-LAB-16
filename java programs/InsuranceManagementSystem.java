class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, double premiumAmount) { 
        this.policyNumber = policyNumber; 
        this.policyHolderName = policyHolderName;
        setPremiumAmount(premiumAmount);
    }
    
    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public double getPremiumAmount() { return premiumAmount; }
    
    public void setPremiumAmount(double premiumAmount) { 
        if (premiumAmount > 0) {
            this.premiumAmount = premiumAmount;
        } else {
            System.out.println("Invalid premium amount! Must be positive.");
        }
    }
    
    public void displayPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Premium Amount: $" + premiumAmount);
    }
}

public class InsuranceManagementSystem {
    public static void main(String[] args) {
        InsurancePolicy policy1 = new InsurancePolicy("INS78945", "John Doe", 500.0);
        policy1.displayPolicyDetails();
        
        policy1.setPremiumAmount(-100); 
        policy1.setPremiumAmount(750); 
        policy1.displayPolicyDetails();
    }
}
