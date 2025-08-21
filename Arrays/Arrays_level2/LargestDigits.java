import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Extract digits into array
        while (num != 0 && index < maxDigit) {
            digits[index] = num % 10; // last digit
            num /= 10;                // remove last digit
            index++;
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);

        sc.close();
    }
}
