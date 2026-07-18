package Assignment3.travelCompany;
// package Assignment3.travelCompany.bookings;
import Assignment3.travelCompany.Flights.flight;
import Assignment3.travelCompany.hotel.hotel;
import Assignment3.travelCompany.bookings.booking;

public class main {
    public static void main(String[] args) {
        flight flight =new flight("1234", "Delhi", 7000);
        hotel hotel =new hotel("7895", "Kolkata", 8000);

        booking booking = new booking();

        booking.bookFlight(flight);

        System.out.println();

        booking.bookHotel(hotel);
    }
}
