import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        // Taking input
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Checking each number
        for (int n : nums) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is positive and even");
                } else {
                    System.out.println(n + " is positive and odd");
                }
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println(n + " is zero");
            }
        }

        // Compare first and last
        if (nums[0] == nums[4]) {
            System.out.println("First and last elements are equal.");
        } else if (nums[0] > nums[4]) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}
