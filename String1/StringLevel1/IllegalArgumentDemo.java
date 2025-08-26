import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgument(String str) {
        // start index > end index
        System.out.println(str.substring(5, 2)); // This will throw exception
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgument(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Call method that generates exception
        System.out.println("Generating IllegalArgumentException...");
        // generateIllegalArgument(input); // Uncomment to see program crash

        // Call method that handles exception
        System.out.println("\nHandling IllegalArgumentException...");
        handleIllegalArgument(input);

        sc.close();
    }
}
