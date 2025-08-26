package StringLevel3;

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // try to access character at index
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueChars(String text) {
        int len = getLength(text);
        char[] temp = new char[len]; // temporary array to store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if ch appeared before
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, add to temp
            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // create final array of exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
