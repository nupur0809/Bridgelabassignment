package StringLevel3;

import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // return as string array
        return new String[] {
                String.format("%.2f", heightCm),
                String.format("%.2f", weight),
                String.format("%.2f", bmi),
                status
        };
    }

    // Method that processes the 2D array of height and weight
    public static String[][] processData(double[][] hw) {
        String[][] result = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {
            result[i] = calculateBMI(hw[i][0], hw[i][1]);
        }
        return result;
    }

    // Method to display data in tabular format
    public static void displayData(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    row[0], row[1], row[2], row
        }
    }
}