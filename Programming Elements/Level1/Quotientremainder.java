import java.util.Scanner;

public class Quotientremainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Checking division by zero
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Printing result
            System.out.println("The Quotient is " + quotient +
                               " and Remainder is " + remainder +
                               " of two numbers " + number1 + " and " + number2);
        }

        sc.close();
    }
}