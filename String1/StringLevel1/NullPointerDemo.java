public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNullPointer() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method that generates exception
        System.out.println("Generating NullPointerException...");
        // generateNullPointer(); // Uncomment to see program crash

        // Call method that handles exception
        System.out.println("\nHandling NullPointerException...");
        handleNullPointer();
    }
}
