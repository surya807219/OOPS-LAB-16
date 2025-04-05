class Doctor {
    void treatPatient() {
        System.out.println("General doctor treating patient.");
    }
}

class Cardiologist extends Doctor {
 void treatPatient() {
        System.out.println("Cardiologist treating heart-related issues.");
    }
}

class Dermatologist extends Doctor {
    void treatPatient() {
        System.out.println("Dermatologist treating skin-related issues.");
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d1 = new Cardiologist();
        Doctor d2 = new Dermatologist();

        d1.treatPatient();
        d2.treatPatient();
    }
}
