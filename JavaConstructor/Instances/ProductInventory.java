package Instances;

class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment whenever new product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: " + price);
    }

    // Class method (static)
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
