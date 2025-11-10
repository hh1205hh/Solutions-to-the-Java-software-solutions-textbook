package HospitalEmployees;

/**
 * Represents a Surgeon in a hospital.
 */
public class Surgeon extends Employees {
    private String securityNumber;

    /**
     * Constructs a Surgeon with the specified details.
     * @param sName The name of the Surgeon.
     * @param sPhoneNumber The phone number of the Surgeon.
     * @param sAddress The address of the Surgeon.
     * @param sPay The pay of the Surgeon.
     * @param sSecurityNumber The security number of the Surgeon.
     */
    public Surgeon(String sName, String sPhoneNumber, String sAddress, double sPay, String sSecurityNumber) {
        super(sName, sPhoneNumber, sAddress, sPay);
        securityNumber = sSecurityNumber;
    }

    /**
     * Gets the security number of the Surgeon.
     * @return The security number.
     */
    public String getSecurityNumber() {
        return securityNumber;
    }

    /**
     * Gets the job description of the Surgeon.
     * @return The job description.
     */
    public String surgeonJob() {
        return "Perform surgical procedures to treat various medical conditions.";
    }

    /**
     * Generates a string representation of the Surgeon.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Security number: " + securityNumber;
    }
}
