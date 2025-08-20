// Program to find the youngest and tallest among 3 friends
import java.util.Scanner;

class FriendAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get ages of the friends
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();

        // Get heights of the friends
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = input.nextDouble();

        // Find the youngest age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        System.out.println("The youngest age among friends is: " + youngestAge);

        // Find the tallest height
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        System.out.println("The tallest height among friends is: " + tallestHeight);

        // Close the scanner
        input.close();
    }
}
