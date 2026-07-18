package Assignment3.travelCompany.hotel;

public class hotel {
    String hotelName;
    String location;
    int price;

    public hotel(String hotelName, String location, int price){
        this.hotelName=hotelName;
        this.location=location;
        this.price=price;
    }

    public String getDetails(){
        return "Hotel name: "+hotelName+
        "\nLocation: "+location+
        "\nPrice :"+price;
    }
}
