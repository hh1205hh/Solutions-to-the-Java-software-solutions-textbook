package HospitalEmployees;
 
/**
 * Represents an Administrator(מנהל) employee in a hospital.
 * Inherits properties from the Employees class and adds a security number.
 */
public class Administrator extends Employees {
    private String securityNumber;

    /**
     * Constructs an Administrator with the specified details.
     * @param aName The name of the administrator.
     * @param aPhoneNumber The phone number of the administrator.
     * @param aAddress The address of the administrator.
     * @param aPay The pay of the administrator.
     * @param aSecurityNumber The security number of the administrator.
     */
    public Administrator(String aName, String aPhoneNumber, String aAddress, double aPay, String aSecurityNumber) {
        super(aName, aPhoneNumber, aAddress, aPay);
        securityNumber = aSecurityNumber;
    }

    /**
     * Gets the security number of the administrator.
     * @return The security number.
     */
    public String getSecurityNumber() {
        return securityNumber;
    }
    
    /**
     * Returns the job description of an administrator.
     * @return A description of administrator's responsibilities.
     */
    public String administratorJob() {
        return "Oversee, manage, ensure compliance, coordinate in hospital operations.";
    }
    
    /**
     * Generates a string representation of the administrator.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + 
               "Security number: " + securityNumber + System.lineSeparator();
    }
}
