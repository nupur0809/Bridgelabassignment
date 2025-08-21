import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays to store data
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Take marks input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int p = sc.nextInt();
            if (p < 0) {
                System.out.println("Marks cannot be negative! Enter again.");
                i--; // retry same student
                continue;
            }

            System.out.print("Chemistry: ");
            int c = sc.nextInt();
            if (c < 0) {
                System.out.println("Marks cannot be negative! Enter again.");
                i--;
                continue;
            }

            System.out.print("Maths: ");
            int m = sc.nextInt();
            if (m < 0) {
                System.out.println("Marks cannot be negative! Enter again.");
                i--;
                continue;
            }

            // Store in arrays
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            // Step 4: Compute percentage
            percentage[i] = (p + c + m) / 3.0;

            // Step 5: Assign grade
            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 50)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }

        // Step 6: Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": "
                    + " Physics = " + physics[i]
                    + ", Chemistry = " + chemistry[i]
                    + ", Maths = " + maths[i]
                    + ", Percentage = " + percentage[i] + "%"
                    + ", Grade = " + grade[i]);
        }

        sc.close();
    }
}
