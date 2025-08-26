package StringLevel3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        // Count frequency
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        // Create 2D array to store character and its frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freq = findFrequency(input);
        System.out.println("Character\tFrequency");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}
