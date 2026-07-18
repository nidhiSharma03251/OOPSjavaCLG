package Assignment3.travelCompany.Flights;

public class flight {
    String flightNumber;
    String destination;
    int price;

    public flight(String flightNumber, String destination, int price){
        this.flightNumber=flightNumber;
        this.destination=destination;
        this.price=price;
    }

    public String getDetails(){
        return "Flight number: "+flightNumber+
        "\nDestination: "+destination+
        "\nPrice: "+price;
    }
}
