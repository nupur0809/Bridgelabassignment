import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take unit price from the user
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        // Take quantity from the user
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}
