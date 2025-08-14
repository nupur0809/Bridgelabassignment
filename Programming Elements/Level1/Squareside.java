import java.util.Scanner;

public class Squareside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking perimeter input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculating side (Perimeter = 4 × side)
        double side = perimeter / 4;

        // Printing result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}