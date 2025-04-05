class Person {
    void walk() {
        System.out.println("A person can walk");
    }
}
class Doctor extends Person {
    void treatPatients() {
        System.out.println("Doctor is treating patients");
    }
}
class Surgeon extends Doctor {
    void performSurgery() {
        System.out.println("Surgeon is performing surgery");
    }
}
public class Hospital {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.walk();          
        surgeon.treatPatients(); 
        surgeon.performSurgery();
    }
}
