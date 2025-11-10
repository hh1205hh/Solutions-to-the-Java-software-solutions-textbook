package HospitalEmployees;

/**
 * Represents a Nurse in a hospital.
 */
public class Nurse extends Employees {

    /**
     * Constructs a Nurse with the specified details.
     * @param nName The name of the Nurse.
     * @param nPhoneNumber The phone number of the Nurse.
     * @param nAddress The address of the Nurse.
     * @param nPay The pay of the Nurse.
     */
    public Nurse(String nName, String nPhoneNumber, String nAddress, double nPay) {
        super(nName, nPhoneNumber, nAddress, nPay);
    }

    /**
     * Gets the job description of the Nurse.
     * @return The job description.
     */
    public String nurseJob() {
        return "Provide patient care, support doctors, and educate patients.";
    }
    
    /**
     * Generates a string representation of the Nurse.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
