import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Convert number to string to find number of digits
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Array to store digits
        int[] digits = new int[length];

        // Fill digits array
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';  // convert char → int
        }

        // Frequency array for digits 0–9
        int[] frequency = new int[10];

        // Count frequency
        for (int d : digits) {
            frequency[d]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Only show digits that appear
                System.out.println("Digit " + i + " → " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
