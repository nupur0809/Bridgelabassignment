import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // 2D array to store weight, height, and BMI
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        // Input weight and height for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data for person " + (i + 1));

            // Weight validation
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive! Try again.");
                }
            } while (weight <= 0);

            // Height validation
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive! Try again.");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal weight";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": " +
                    "Weight = " + personData[i][0] + " kg, " +
                    "Height = " + personData[i][1] + " m, " +
                    "BMI = " + String.format("%.2f", personData[i][2]) + ", " +
                    "Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
