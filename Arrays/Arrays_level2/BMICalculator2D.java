import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create 2D array to store weight, height, and BMI
        // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Step 3: Input weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input weight
            while (true) {
                System.out.print("Weight (kg): ");
                double weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive weight!");
                } else {
                    personData[i][0] = weight;
                    break;
                }
            }

            // Input height
            while (true) {
                System.out.print("Height (m): ");
                double height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive height!");
                } else {
                    personData[i][1] = height;
                    break;
                }
            }

            // Step 4: Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display the results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Person", "Weight", "Height", "BMI (Status)");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15.2f (%s)%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}

