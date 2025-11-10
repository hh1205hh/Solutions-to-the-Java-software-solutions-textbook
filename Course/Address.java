package Course;

/**
 * The Address class represents an address with street address, city, state, and zip code.
 */
public class Address {  
    private String streetAddress;
    private String city;
    private String state;
    private Long zipCode;

    /**
     * Constructs an Address object with the given street address, city, state, and zip code.
     * @param streetAddress The street address.
     * @param city The city.
     * @param state The state.
     * @param zipCode The zip code.
     */
    public Address(String streetAddress, String city, String state, Long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city; 
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Gets the street address.
     * @return The street address.
     */
    public String getStreetAddress() {
        return streetAddress;
    }
    
    /**
     * Sets the street address.
     * @param newStreetAddress The new street address.
     */
    public void setStreetAddress(String newStreetAddress) {
        this.streetAddress = newStreetAddress;
    }
    
    /**
     * Gets the city.
     * @return The city.
     */
    public String getCity() {
        return city;
    }
    
    /**
     * Sets the city.
     * @param newCity The new city.
     */
    public void setCity(String newCity) {
        this.city = newCity;
    }
    
    /**
     * Gets the state.
     * @return The state.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the state.
     * @param newState The new state.
     */
    public void setState(String newState) {
        this.state = newState;
    }
    
    /**
     * Gets the zip code.
     * @return The zip code.
     */
    public Long getZipCode() {
        return zipCode;
    }
    
    /**
     * Sets the zip code.
     * @param newZipCode The new zip code.
     */
    public void setZipCode(Long newZipCode) {
        this.zipCode = newZipCode;
    }

    /**
     * Returns a string representation of the address.
     * @return A string representing the address.
     */
    @Override
    public String toString() {
        return "Street address: " + this.streetAddress + System.lineSeparator() + 
               "City: " + this.city + System.lineSeparator() + 
               "State: " + this.state + System.lineSeparator() + 
               "Zip code: " + this.zipCode + "\n";
    }
}
