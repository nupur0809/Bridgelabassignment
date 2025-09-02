public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 50000, 1);
        CartItem item2 = new CartItem("Mouse", 500, 2);

        item1.display();
        item2.display();
        double totalCart = item1.getTotalCost() + item2.getTotalCost();
        System.out.println("Total Cart Cost: " + totalCart);
    }
}
