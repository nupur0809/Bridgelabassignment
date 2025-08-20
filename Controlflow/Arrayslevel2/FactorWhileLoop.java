import java.util.Scanner;

class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        System.out.println("Factors of " + number + " are:");
        int counter = 1;

        // Run while loop to find factors
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }

        input.close();
    }
}
