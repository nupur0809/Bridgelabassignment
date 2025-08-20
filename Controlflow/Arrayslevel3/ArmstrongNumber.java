import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;  // store original number
        int sum = 0;                  // to store sum of cubes of digits

        // Step 2: Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // get last digit
            sum += digit * digit * digit;      // add cube of digit to sum
            originalNumber = originalNumber / 10;  // remove last digit
        }

        // Step 3: Compare and print result
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}

