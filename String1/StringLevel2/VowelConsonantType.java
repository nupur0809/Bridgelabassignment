package StringLevel2;

import java.util.Scanner;

public class VowelConsonantType {

    // Method to check character type
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Method to generate 2D array with char + type
    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }

    // Display method
    public static void display2D(String[][] arr) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        for (String[] row : arr) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findCharTypes(text);
        display2D(result);
    }
}
