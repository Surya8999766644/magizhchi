abstract class Transport {
    int passengerId;
    String passengerName;
    String fromCity;
    String toCity;
    double distance;
    double fare;

    abstract void calculateFare();

    void displayTicket() {
        System.out.println("----- TICKET DETAILS -----");
        System.out.println("Passenger ID   : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Route          : " + fromCity + " -> " + toCity);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : ₹" + fare);
    }
}

class CityBus extends Transport {
    void calculateFare() {
        fare = distance * 5;
    }
}

class LuxuryBus extends Transport {
    void calculateFare() {
        fare = (distance * 10) + 200;
    }
}

public class TransportManagement {
    public static void main(String[] args) {

        Transport t;

        // City Bus Booking
        t = new CityBus();
        t.passengerId = 101;
        t.passengerName = "Surya";
        t.fromCity = "Virudhunagar";
        t.toCity = "Tripur";
        t.distance = 500;

        // Calculate Fare
        t.calculateFare();

        // Display Ticket
        t.displayTicket();
    }
}

