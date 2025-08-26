package StringLevel2;

import java.util.Scanner;

public class StringLengthWithoutMethod {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop when exception occurs
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("User Defined Length: " + userDefinedLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
