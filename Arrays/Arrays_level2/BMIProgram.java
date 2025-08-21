import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i+1) + ": ");
            height[i] = sc.nextDouble();

            // calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // determine status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // display
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) +
                " | Height: " + height[i] +
                " m | Weight: " + weight[i] +
                " kg | BMI: " + String.format("%.2f", bmi[i]) +
                " | Status: " + status[i]);
        }
    }
}
