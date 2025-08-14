import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs in cm
        System.out.print("Enter the base of the triangle (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Converting to square inches (1 inch = 2.54 cm => 1 sq inch = (2.54)^2 sq cm)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Printing results
        System.out.println("\nThe Area of the triangle in square centimeters is: " + areaSqCm);
        System.out.println("The Area of the triangle in square inches is: " + areaSqIn);

        sc.close();
    }
}