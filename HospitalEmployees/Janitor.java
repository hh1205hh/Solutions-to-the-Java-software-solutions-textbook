package HospitalEmployees;

/**
 * Represents a Janitor (שרת) in a hospital.
 */
public class Janitor extends Employees {

    /**
     * Constructs a Janitor with the specified details.
     * @param jName The name of the Janitor.
     * @param jPhoneNumber The phone number of the Janitor.
     * @param jAddress The address of the Janitor.
     * @param jPay The pay of the Janitor.
     */
    public Janitor(String jName, String jPhoneNumber, String jAddress, double jPay) {
        super(jName, jPhoneNumber, jAddress, jPay);
    }
 
    /**
     * Gets the job description of the Janitor.
     * @return The job description.
     */
    public String janitorJob() {
        return "Maintain cleanliness and sanitation in hospital facilities.";
    }

    /**
     * Generates a string representation of the Janitor.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return super.toString() + System.lineSeparator();
    } 
}
