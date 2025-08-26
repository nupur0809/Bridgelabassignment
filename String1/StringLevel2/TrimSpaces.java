package StringLevel2;

import java.util.Scanner;

public class TrimSpaces {

    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        // find first non-space
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        // find last non-space
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // build trimmed string manually
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String trimmed = trimSpaces(text);
        System.out.println("Original: >" + text + "<");
        System.out.println("Trimmed : >" + trimmed + "<");
    }
}
