import java.util.Scanner;

public class Doubleopt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Performing operations (operator precedence will apply)
        double result1 = a + b * c;   // Multiplication before addition
        double result2 = a * b + c;   // Multiplication before addition
        double result3 = c + a / b;   // Division before addition
        double result4 = a % b + c;   // Modulus before addition

        // Printing results
        System.out.println("The results of Double Operations are: " +
                           result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    }
}