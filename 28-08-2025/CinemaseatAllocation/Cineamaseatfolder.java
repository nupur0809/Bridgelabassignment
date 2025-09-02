import java.util.Scanner;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols]; // 0 = empty, 1 = booked

        while (true) {
            System.out.println("\n--- Cinema Seat Allocation ---");
            System.out.println("1. Book seats for family of 3");
            System.out.println("2. Show seat layout");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                boolean booked = false;

                // check each row
                for (int i = 0; i < rows; i++) {
                    // check for 3 consecutive empty seats
                    for (int j = 0; j <= cols - 3; j++) {
                        if (seats[i][j] == 0 && seats[i][j + 1] == 0 && seats[i][j + 2] == 0) {
                            // book them
                            seats[i][j] = seats[i][j + 1] = seats[i][j + 2] = 1;
                            System.out.println("Booked seats at Row " + (i + 1) + " → [" + (j + 1) + "," + (j + 2) + "," + (j + 3) + "]");
                            booked = true;
                            break;
                        }
                    }
                    if (booked) break;
                }

                if (!booked) {
                    System.out.println("❌ Not available: No 3 consecutive seats found!");
                }
            } 
            else if (choice == 2) {
                System.out.println("\nSeat Layout (0 = Empty, 1 = Booked):");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
                }
            } 
            else if (choice == 3) {
                System.out.println("Exiting... Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
