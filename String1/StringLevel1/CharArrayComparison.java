import java.util.Scanner;

public class CharArrayComparison {
    // Convert String to char[] manually
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.next();

        char[] customArr = customToCharArray(input);
        char[] builtInArr = input.toCharArray();

        System.out.print("Custom char array: ");
        for (char c : customArr) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : builtInArr) System.out.print(c + " ");
        System.out.println();

        System.out.println("Char arrays equal? " + compareCharArrays(customArr, builtInArr));

        sc.close();
    }
}
