import java.util.Scanner;

public class StringComparison {
    // Compare strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.next();
        System.out.println("Enter second string: ");
        String str2 = sc.next();

        boolean customCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("\nCustom compare result: " + customCompare);
        System.out.println("Built-in equals() result: " + builtInCompare);
        System.out.println("Results match? " + (customCompare == builtInCompare));

        sc.close();
    }
}
