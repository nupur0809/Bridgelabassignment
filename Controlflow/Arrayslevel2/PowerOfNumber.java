import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number and power input
        System.out.print("Enter the base number: ");
        int base = input.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Power must be a positive integer.");
            input.close();
            return;
        }

        int result = 1;

        // Compute power using for loop
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + power + " is: " + result);
        input.close();
    }
}
