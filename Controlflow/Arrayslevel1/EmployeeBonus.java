import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0.0;
        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount: " + bonus);
    }
}
