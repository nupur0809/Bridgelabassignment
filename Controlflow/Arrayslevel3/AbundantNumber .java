import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Step 2: Sum all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 3: Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}
