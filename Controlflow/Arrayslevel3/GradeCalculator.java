import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double total = physics + chemistry + maths;
        double percentage = total / 3;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A+ | Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: A | Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B | Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C | Average");
        } else {
            System.out.println("Grade: F | Fail");
        }

        sc.close();
    }
}
