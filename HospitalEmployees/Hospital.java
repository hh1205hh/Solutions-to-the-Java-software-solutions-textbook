package HospitalEmployees;

public class Hospital { 
    public static void main(String[] args) {
        Administrator admin = new Administrator("John Doe", "123-456-7890", "123 Main St", 5000, "ASD123");
        Doctor doctor = new Doctor("Dr. Smith", "987-654-3210", "456 Oak St", 8000, "QWE456");
        Janitor janitor = new Janitor("Bob", "555-123-4567", "789 Elm St", 2500);
        Nurse nurse = new Nurse("Alice", "333-444-5555", "111 Pine St", 6000);
        Receptionist receptionist = new Receptionist("Emily", "222-333-4444", "222 Maple St", 3500);
        Surgeon surgeon = new Surgeon("Dr. Johnson", "888-999-0000", "789 Cedar St", 10000, "ZXC789");

        System.out.println("Administrator: ");
        System.out.println(admin);
        System.out.println("Job: " + admin.administratorJob());
        System.out.println("Pay: $" + admin.getPay());
        System.out.println();

        System.out.println("Doctor: ");
        System.out.println(doctor);
        System.out.println("Job: " + doctor.doctorJob());
        System.out.println("Pay: $" + doctor.getPay());
        System.out.println();
        
        System.out.println("Janitor: ");
        System.out.println(janitor);
        System.out.println("Job: " + janitor.janitorJob());
        System.out.println("Pay: $" + janitor.getPay());
        System.out.println();

        System.out.println("Nurse: ");
        System.out.println(nurse);
        System.out.println("Job: " + nurse.nurseJob());
        System.out.println("Pay: $" + nurse.getPay());
        System.out.println();

        System.out.println("Receptionist: ");
        System.out.println(receptionist);
        System.out.println("Job: " + receptionist.receptionistJob());
        System.out.println("Pay: $" + receptionist.getPay());
        System.out.println();

        System.out.println("Surgeon: ");
        System.out.println(surgeon);
        System.out.println("Job: " + surgeon.surgeonJob());
        System.out.println("Pay: $" + surgeon.getPay());
        System.out.println();        
    }
}

