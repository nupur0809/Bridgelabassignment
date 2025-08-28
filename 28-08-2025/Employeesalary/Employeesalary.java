import java.util.*;

class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] basicSalary = new int[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of employee " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter basic salary of " + names[i] + ": ");
            basicSalary[i] = sc.nextInt();
        }

        System.out.println("\n----- Employee Salary Slips -----");

        // Calculate salary slip for each employee
        for (int i = 0; i < n; i++) {
            double hra = basicSalary[i] * 0.20;  // 20% HRA
            double da  = basicSalary[i] * 0.10;  // 10% DA
            double netSalary = basicSalary[i] + hra + da;

            // Apply tax if salary > 50,000
            if (netSalary > 50000) {
                double tax = netSalary * 0.10;
                netSalary -= tax;
                System.out.println("\n--- Salary Slip for " + names[i] + " ---");
                System.out.println("Basic Salary : " + basicSalary[i]);
                System.out.println("HRA (20%)    : " + hra);
                System.out.println("DA (10%)     : " + da);
                System.out.println("Tax (10%)    : " + tax);
                System.out.println("Net Salary   : " + netSalary);
            } else {
                System.out.println("\n--- Salary Slip for " + names[i] + " ---");
                System.out.println("Basic Salary : " + basicSalary[i]);
                System.out.println("HRA (20%)    : " + hra);
                System.out.println("DA (10%)     : " + da);
                System.out.println("Net Salary   : " + netSalary);
            }
        }

        sc.close();
    }
} 