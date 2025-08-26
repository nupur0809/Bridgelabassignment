import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexException(String str) {
        // Accessing index beyond length
        System.out.println(str.charAt(str.length())); // This will throw exception
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates exception
        System.out.println("Generating StringIndexOutOfBoundsException...");
        // generateStringIndexException(input); // Uncomment to see program crash

        // Call method that handles exception
        System.out.println("\nHandling StringIndexOutOfBoundsException...");
        handleStringIndexException(input);

        sc.close();
    }
}
