class Employee {
    void calculateSalary() {
        System.out.println("Calculating general employee salary.");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for Full-Time Employee with benefits.");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for Part-Time Employee based on hours worked.");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
