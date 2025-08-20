import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        // Step 2: Sum all digits using while loop
        while (temp != 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add to sum
            temp = temp / 10;       // remove last digit
        }

        // Step 3: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
