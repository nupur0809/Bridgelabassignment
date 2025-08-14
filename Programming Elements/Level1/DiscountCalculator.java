import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the Student Fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for discount percent
        System.out.print("Enter the Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Output result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
