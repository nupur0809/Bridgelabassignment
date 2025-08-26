import java.util.Scanner;

public class UppercaseConversion {

    // Convert to uppercase manually
    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32); // convert to uppercase
            } else {
                result += c;
            }
        }
        return result;
    }

    // Compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String input = sc.nextLine();

        String customUpper = customToUpperCase(input);
        String builtInUpper = input.toUpperCase();

        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Comparison result: " + compareStrings(customUpper, builtInUpper));

        sc.close();
    }
}
