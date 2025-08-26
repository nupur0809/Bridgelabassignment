package StringLevel3;

import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check lengths
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[256]; // frequency array for first text
        int[] freq2 = new int[256]; // frequency array for second text

        // Step 2: Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Step 3: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true; // all frequencies match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are NOT anagrams.");
        }

        sc.close();
    }
}
