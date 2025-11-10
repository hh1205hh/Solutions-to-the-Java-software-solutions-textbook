/* 
Design and implement a set of classes that define the employees of a hospital:
Doctor, Nurse, Administrator, Surgeon, Receptionist, Janitor.
Include methods in each class that are named according to the services provided 
by that person and that print an appropriate message.
Create a main class to instantiate and exercise several of the classes.
*/

package HospitalEmployees;

/**
 * Represents an Employee in a hospital.
 */
public class Employees {
    protected String name;
    protected String phoneNumber;
    protected String address;
    protected double pay;

    /**
     * Constructs an Employee with the specified details.
     * @param eName The name of the employee.
     * @param ePhoneNumber The phone number of the employee.
     * @param eAddress The address of the employee.
     * @param ePay The pay of the employee.
     */
    public Employees(String eName, String ePhoneNumber, String eAddress, double ePay) {
        name = eName;
        phoneNumber = ePhoneNumber;
        address = eAddress;
        pay = ePay;
    }
 
    /**
     * Sets the pay of the employee.
     * @param newPay The new pay to set.
     */
    public void setPay(double newPay) {
        this.pay = newPay;
    }

    /**
     * Gets the pay of the employee.
     * @return The pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * Sets the name of the employee.
     * @param newName The new name to set.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Gets the name of the employee.
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the phone number of the employee.
     * @param newPhoneNumber The new phone number to set.
     */
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    /**
     * Gets the phone number of the employee.
     * @return The phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Gets the address of the employee.
     * @return The address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the employee.
     * @param newAddress The new address to set.
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }
    
    /**
     * Generates a string representation of the employee.
     * @return The string representation including all details.
     */
    @Override
    public String toString() {
        return "Name of the employee: " + name + System.lineSeparator() +
               "Phone number: " + phoneNumber + System.lineSeparator() + 
               "Address: " + address + System.lineSeparator() + 
               "Pay per month: " + pay;
    }
}