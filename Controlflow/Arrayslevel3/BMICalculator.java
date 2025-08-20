import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user inputs
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Step 2: Convert height to meters
        double heightM = heightCm / 100;

        // Step 3: Apply BMI formula
        double bmi = weight / (heightM * heightM);

        System.out.println("Your BMI is: " + bmi);

        // Step 4: Determine weight status
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Status: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
