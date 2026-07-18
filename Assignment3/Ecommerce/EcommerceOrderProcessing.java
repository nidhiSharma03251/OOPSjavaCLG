package Assignment3.Ecommerce;

// Custom Exception Class
class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}

// Product Class
class Product {

    String name;
    int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void purchase(int quantity)
            throws OutOfStockException {

        if (quantity > stock) {
            throw new OutOfStockException(
                    "Product is out of stock! Available stock: "
                    + stock);
        }

        stock -= quantity;

        System.out.println("Purchase Successful!");
        System.out.println("Product: " + name);
        System.out.println("Quantity Purchased: " + quantity);
        System.out.println("Remaining Stock: " + stock);
    }
}

// Main Class
public class EcommerceOrderProcessing {

    public static void main(String[] args) {

        Product product =
                new Product("Laptop", 5);

        try {

            // User tries to buy 10 items
            product.purchase(4);

        } catch (OutOfStockException e) {

            System.out.println("Order Failed!");
            System.out.println(e.getMessage());

        }
    }
}
