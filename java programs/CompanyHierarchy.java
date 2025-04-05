class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team");
    }
}
class Director extends Manager {
    void makeDecisions() {
        System.out.println("Director is making high-level decisions");
    }
}
public class CompanyHierarchy {
    public static void main(String[] args) {
        Director director = new Director();
        director.work();        
        director.manageTeam();  
        director.makeDecisions(); 
    }
}
