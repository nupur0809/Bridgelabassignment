import java.util.Scanner;

public class Basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        // Performing operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        
        // Handling division by zero
        String division;
        if (number2 != 0) {
            division = String.valueOf(number1 / number2);
        } else {
            division = "Undefined (division by zero not allowed)";
        }

        // Printing results
        System.out.println("\nThe addition of " + number1 + " and " + number2 + " is: " + addition);
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + subtraction);
        System.out.println("The multiplication of " + number1 + " and " + number2 + " is: " + multiplication);
        System.out.println("The division of " + number1 + " and " + number2 + " is: " + division);

        sc.close();
    }
}