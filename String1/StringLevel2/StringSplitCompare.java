package StringLevel2;

import java.util.Scanner;

public class StringSplitCompare {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        words[wordIndex] = sb.toString();

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] userDefinedSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userDefinedSplit, builtInSplit);

        System.out.println("User Defined Split:");
        for (String w : userDefinedSplit) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtInSplit) System.out.println(w);

        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}
