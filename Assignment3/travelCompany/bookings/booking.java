package Assignment3.travelCompany.bookings;

import Assignment3.travelCompany.Flights.flight;
import Assignment3.travelCompany.hotel.hotel;


public class booking {
    public void bookFlight(flight f){
        System.out.println("Flight Booked Successfully!");
        System.out.println(f.getDetails());
    }
    public void bookHotel(hotel h) {
        System.out.println("Hotel Booked Successfully!");
        System.out.println(h.getDetails());
    }
}
