package StringLevel3;

import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; // skip if already counted

            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate as counted
                }
            }
        }

        // Count non-zero frequencies to create result array
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] freqResult = findFrequency(input);
        System.out.println("Character Frequencies:");
        for (String s : freqResult) {
            System.out.println(s);
        }

        sc.close();
    }
}
