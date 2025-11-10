package HospitalEmployees;

/**
 * Represents a Receptionist in a hospital.
 */
public class Receptionist extends Employees {

    /**
     * Constructs a Receptionist with the specified details.
     * @param rName The name of the Receptionist.
     * @param rPhoneNumber The phone number of the Receptionist.
     * @param rAddress The address of the Receptionist.
     * @param rPay The pay of the Receptionist.
     */
    public Receptionist(String rName, String rPhoneNumber, String rAddress, double rPay) {
        super(rName, rPhoneNumber, rAddress, rPay);
    }

    /**
     * Gets the job description of the Receptionist.
     * @return The job description.
     */
    public String receptionistJob() {
        return "Greet patients, schedule appointments, and manage front desk tasks.";
    }

    /**
     * Generates a string representation of the Receptionist.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
