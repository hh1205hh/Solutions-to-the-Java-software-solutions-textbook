package HospitalEmployees;

/**
 * Represents a Doctor employee in a hospital.
 * Inherits properties from the Employees class and adds a security number.
 */
public class Doctor extends Employees {
    private String securityNumber;

    /**
     * Constructs a Doctor with the specified details.
     * @param dName The name of the doctor.
     * @param dPhoneNumber The phone number of the doctor.
     * @param dAddress The address of the doctor.
     * @param dPay The pay of the doctor.
     * @param dSecurityNumber The security number of the doctor.
     */
    public Doctor(String dName, String dPhoneNumber, String dAddress, double dPay, String dSecurityNumber) {
        super(dName, dPhoneNumber, dAddress, dPay);
        securityNumber = dSecurityNumber;
    }
 
    /**
     * Gets the security number of the doctor.
     * @return The security number.
     */
    public String getSecurityNumber() {
        return securityNumber;
    }

    /**
     * Returns the job description of a doctor.
     * @return A description of doctor's responsibilities.
     */
    public String doctorJob() {
        return "Diagnose, treat, and care for patients in medical settings.";
    }

    /**
     * Generates a string representation of the doctor.
     * @return The string representation including all details.
     */
    @Override 
    public String toString() {
        return super.toString() + System.lineSeparator() + 
               "Security number of the doctor: " + securityNumber;
    } 
}
