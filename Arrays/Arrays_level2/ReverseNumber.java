import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // find count of digits
        long temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // store digits
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }

        // reverse array
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // display reverse
        System.out.print("Reversed number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }
    }
}
