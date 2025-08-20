import java.util.Scanner;

class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = input.nextInt();

        if (power < 0) {
            System.out.println("Power must be a positive integer.");
            input.close();
            return;
        }

        int result = 1;
        int counter = 0;

        // Using while loop to calculate power
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
        input.close();
    }
}
