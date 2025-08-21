import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        // 2D array for marks [students][3 subjects]
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Input marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;

                // Validate marks
                do {
                    System.out.print(subject + " marks: ");
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks must be positive! Try again.");
                    }
                } while (mark < 0);

                marks[i][j] = mark;
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        // Display results
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                    " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] +
                    " | Percentage: " + String.format("%.2f", percentage[i]) + "%" +
                    " | Grade: " + grade[i]);
        }

        sc.close();
    }
}
