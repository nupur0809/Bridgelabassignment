// Program to generate multiplication table of a number from 6 to 9
// Follows best programming practices
import java.util.Scanner;

class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to generate multiplication table (6 to 9): ");
        int number = input.nextInt();

        // Validate input
        if (number < 6 || number > 9) {
            System.err.println("Invalid number! Please enter a number between 6 and 9.");
            System.exit(0);
        }

        // Declare array to store results
        int tableSize = 10;
        int[] multiplicationResult = new int[tableSize];

        // Calculate multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 1);
        }

        // Display result
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }

        // Close Scanner
        input.close();
    }
}
