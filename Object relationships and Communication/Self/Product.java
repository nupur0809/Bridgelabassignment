import java.util.ArrayList;

class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) System.out.println(p.name + " - $" + p.price);
    }
}

class CustomerE {
    String name;
    ArrayList<Order> orders = new ArrayList<>();
    CustomerE(String name) { this.name = name; }
    void placeOrder(Order o) { orders.add(o); }
}

public class Problem4 {
    public static void main(String[] args) {
        CustomerE cust = new CustomerE("Alice");
        Order order1 = new Order();
        order1.addProduct(new Product("Laptop", 1200));
        order1.addProduct(new Product("Mouse", 25));

        cust.placeOrder(order1);

        for (Order o : cust.orders) o.showOrder();
    }
}
