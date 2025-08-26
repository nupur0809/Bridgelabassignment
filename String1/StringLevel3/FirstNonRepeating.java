package StringLevel3;

import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find first non-repeating character
    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII characters frequency

        int len = text.length();

        // Count frequency
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if none found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = firstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
