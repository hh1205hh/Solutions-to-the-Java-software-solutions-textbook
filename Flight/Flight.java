/*
Write a class called Flight that represents an airline flight. It should contain instance data 
that represents the airline name, flight number , and the flight's origin and destinations cities.
Define the Flight constructor to accept and initialize all instance data.
Include getter and setter methods for all instance data.
Include a toString method that returns a one-line description of the flight.
Create a driver class called FlightTest , whose main method instantiates and updates several Flight objects
*/

package Flight;

/**
 * Represents a flight with airline name, origin city, destination city, and flight number.
 */
public class Flight {
    private String airLineName;
    private String originCity;
    private String destinationCity;
    private int flightNumber;

    /**
     * Constructs a flight with the given details.
     * @param airLineName The name of the airline.
     * @param originCity The origin city of the flight.
     * @param destinationCity The destination city of the flight.
     * @param flightNumber The flight number.
     */
    public Flight(String airLineName, String originCity, String destinationCity, int flightNumber) {
        this.airLineName = airLineName;
        this.originCity = originCity;
        this.destinationCity = destinationCity;
        this.flightNumber = flightNumber;
    }

    /**
     * Sets the name of the airline.
     * @param newAirLineName The new name of the airline.
     */
    public void setAirLineName(String newAirLineName) {
        this.airLineName = newAirLineName;
    }

    /**
     * Sets the origin city of the flight.
     * @param newOriginCity The new origin city of the flight.
     */
    public void setOriginCity(String newOriginCity) {
        this.originCity = newOriginCity;
    }

    /**
     * Sets the destination city of the flight.
     * @param newDestinationCity The new destination city of the flight.
     */
    public void setDestinationCity(String newDestinationCity) {
        this.destinationCity = newDestinationCity;
    }

    /**
     * Sets the flight number.
     * @param newFlightNumber The new flight number.
     */
    public void setFlightNumber(int newFlightNumber) {
        this.flightNumber = newFlightNumber;
    }

    /**
     * Gets the name of the airline.
     * @return The name of the airline.
     */
    public String getAirLineName() {
        return this.airLineName;
    }

    /**
     * Gets the origin city of the flight.
     * @return The origin city of the flight.
     */
    public String getOriginCity() {
        return this.originCity;
    }

    /**
     * Gets the destination city of the flight.
     * @return The destination city of the flight.
     */
    public String getDestinationCity() {
        return this.destinationCity;
    }

    /**
     * Gets the flight number.
     * @return The flight number.
     */
    public int getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Returns a string representation of the flight.
     * @return A string containing the details of the flight.
     */
    @Override
    public String toString() {
        return "Airline name: " + this.airLineName + System.lineSeparator() +
                "Origin City: " + this.originCity + System.lineSeparator() +
                "Destination city: " + this.destinationCity + System.lineSeparator() +
                "Flight number: " + this.flightNumber + System.lineSeparator();
    }
}
