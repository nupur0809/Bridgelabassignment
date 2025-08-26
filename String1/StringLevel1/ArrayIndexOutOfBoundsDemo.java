import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateArrayException(String[] names) {
        // Accessing index beyond array length
        System.out.println("Accessing element: " + names[names.length]);
    }

    // Method to handle exception
    public static void handleArrayException(String[] names) {
        try {
            System.out.println("Accessing element: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Call method that generates exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        // generateArrayException(names); // Uncomment to crash

        // Call method that handles exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        handleArrayException(names);

        sc.close();
    }
}
