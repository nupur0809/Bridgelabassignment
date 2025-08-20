// Program to find all factors of a positive integer
import java.util.Scanner;

class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            // Loop to find all factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
