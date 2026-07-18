package Assignment3.onlineShopping;

// Base Class
class Product {
    String productName;
    double price;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

// Intermediate Class
class Electronics extends Product {
    String warrantyPeriod;

    // Constructor
    Electronics(String productName, double price, String warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warrantyPeriod);
    }
}

// Derived Class
class Smartphone extends Electronics {
    String batteryLife;

    // Constructor
    Smartphone(String productName, double price,
               String warrantyPeriod, String batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    // Method Overriding
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Life: " + batteryLife);
    }
}

// Main Class
public class onlineShoppingSystem {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone(
                "iPhone 14",
                999,
                "1 year",
                "20 hours"
        );

        System.out.println("=== Product Details ===");
        phone.displayDetails();

        System.out.println("\n=== Product Hierarchy ===");
        System.out.println("Product -> Electronics -> Smartphone");
    }
}