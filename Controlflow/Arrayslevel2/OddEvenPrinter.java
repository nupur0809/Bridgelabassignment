// Program to print odd and even numbers from 1 to n
import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Loop through numbers 1 to n
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        input.close();
    }
}
