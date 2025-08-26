import java.util.Scanner;

public class LowercaseConversion {

    // Convert to lowercase manually
    public static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32); // convert to lowercase
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

        String customLower = customToLowerCase(input);
        String builtInLower = input.toLowerCase();

        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Comparison result: " + compareStrings(customLower, builtInLower));

        sc.close();
    }
}

