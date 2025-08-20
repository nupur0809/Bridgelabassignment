import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int greatestFactor = 1;

        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;  // Stop after finding the greatest factor
            }
        }

        System.out.println("Greatest factor of " + number + " besides itself: " + greatestFactor);
        input.close();
    }
}
