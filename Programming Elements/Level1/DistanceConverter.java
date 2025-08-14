import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take distance in feet from the user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards and miles
        double distanceInYards = distanceInFeet / 3; // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760; // 1 mile = 1760 yards

        // Output
        System.out.println("The distance of " + distanceInFeet + " feet is equal to " +
                           distanceInYards + " yards and " + distanceInMiles + " miles.");

        input.close();
    }
}

