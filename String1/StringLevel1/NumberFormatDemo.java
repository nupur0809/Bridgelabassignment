import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormat(String text) {
        // This will throw NumberFormatException if text is not a valid number
        int num = Integer.parseInt(text);
        System.out.println("Converted number: " + num);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormat(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to convert to number: ");
        String input = sc.nextLine();

        // First call method that generates the exception
        System.out.println("\nGenerating NumberFormatException...");
        // generateNumberFormat(input); // Uncomment to see program crash

        // Then call method that handles the exception
        System.out.println("\nHandling NumberFormatException...");
        handleNumberFormat(input);

        sc.close();
    }
}
