import java.util.Scanner;

class FitnessCenterMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean centerOpen = true;   // while loop condition

        while (centerOpen) { // keep system running until admin exits
            System.out.println("\n--- Fitness Center Membership Registration ---");

            // Ensure at least one registration happens
            do {
                System.out.print("Enter number of members to register: ");
                int n = sc.nextInt();

                // Register multiple members using for loop
                for (int i = 1; i <= n; i++) {
                    System.out.println("\nRegistering Member " + i);

                    // Membership type selection using switch-case
                    System.out.println("Select Membership Type:");
                    System.out.println("1. Monthly (₹1000)");
                    System.out.println("2. Quarterly (₹2500)");
                    System.out.println("3. Yearly (₹9000)");
                    System.out.print("Enter choice (1/2/3): ");
                    int choice = sc.nextInt();

                    int fee = 0;
                    switch (choice) {
                        case 1:
                            fee = 1000;
                            break;
                        case 2:
                            fee = 2500;
                            break;
                        case 3:
                            fee = 9000;
                            break;
                        default:
                            System.out.println("Invalid choice! Defaulting to Monthly.");
                            fee = 1000;
                    }

                    // Discount eligibility using if-else
                    System.out.print("Are you a Student (S) or Senior Citizen (C)? (Y/N): ");
                    char discountChoice = sc.next().charAt(0);

                    if (discountChoice == 'Y' || discountChoice == 'y') {
                        fee = fee - (fee * 20 / 100); // 20% discount
                        System.out.println("Discount Applied! Final Fee: ₹" + fee);
                    } else {
                        System.out.println("No Discount Applied. Final Fee: ₹" + fee);
                    }

                    System.out.println("✅ Member " + i + " Registered Successfully!");
                }

                System.out.print("\nDo you want to register more members? (Y/N): ");
            } while (sc.next().equalsIgnoreCase("Y"));

            // Exit control for admin
            System.out.print("\nDo you want to close registration system? (Y/N): ");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("Y")) {
                centerOpen = false;
                System.out.println("🏋️ Fitness Center Registration Closed. Goodbye!");
            }
        }

        sc.close();
    }
}
