import java.util.Scanner;

public class SumOfNNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        // Sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumFor == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy.");
        }
    }
}
