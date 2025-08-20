import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula to calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output result
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}

