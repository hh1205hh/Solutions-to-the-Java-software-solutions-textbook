package Flight;

public class FlightTest {
    public static void main(String[] args) {
        Flight[] flights = {
            new Flight("Emirates", "Dubai", "New York", 101),
            new Flight("Singapore Airlines", "Singapore", "London", 202),
            new Flight("Delta Air Lines", "Atlanta", "Los Angeles", 303),
            new Flight("Lufthansa", "Frankfurt", "Tokyo", 404)};

            for (Flight flight : flights) {
                System.out.println(flight);
            }
    }
}
