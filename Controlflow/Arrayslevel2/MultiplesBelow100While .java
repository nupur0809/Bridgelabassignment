import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a positive integer less than 100.");
            input.close();
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");
        int multiple = number;

        // Using while loop to print multiples
        while (multiple < 100) {
            System.out.print(multiple + " ");
            multiple += number;  // Move to the next multiple
        }

        input.close();
    }
}
