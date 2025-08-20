import java.util.Scanner;

class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // Run while loop from number-1 to 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;  // Stop after finding the greatest factor
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " besides itself: " + greatestFactor);
        input.close();
    }
}
