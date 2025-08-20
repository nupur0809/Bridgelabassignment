import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        // Sum using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

        if (sumWhile == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("There is a discrepancy.");
        }
    }
}
