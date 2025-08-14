import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height input in centimeters
        System.out.print("Enter base of the triangle (in cm): ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of the triangle (in cm): ");
        double heightCm = input.nextDouble();

        // Area formula: ½ × base × height
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert area from cm² to inches² (1 inch = 2.54 cm)
        double areaInch2 = areaCm2 / (2.54 * 2.54);

        // Output result
        System.out.println("The area of the triangle is " + areaCm2 + " cm² and " + areaInch2 + " in²");

        input.close();
    }
}
