// Program to calculate mean height of players in a football team
// Follows best programming practices
import java.util.Scanner;

class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array for player heights
        int numberOfPlayers = 11;
        double[] heights = new double[numberOfPlayers];

        // Take user input for heights
        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.print("Enter height of player " + (i + 1) + " in cm: ");
                double height = input.nextDouble();

                // Validate input (height should be positive)
                if (height <= 0) {
                    System.err.println("Invalid height! Height must be positive. Enter again.");
                } else {
                    heights[i] = height;
                    break;
                }
            }
        }

        // Calculate sum
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate mean
        double meanHeight = sum / numberOfPlayers;

        // Display result
        System.out.println("\nMean height of the football team = " + meanHeight + " cm");

        // Close Scanner
        input.close();
    }
}
