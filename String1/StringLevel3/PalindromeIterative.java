package StringLevel3;

public class PalindromeIterative {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println("Is palindrome (Iterative)? " + isPalindromeIterative(text));
    }
}
