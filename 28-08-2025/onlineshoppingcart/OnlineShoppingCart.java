import java.util.Scanner;

class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("\n1. Laptop - 40000");
            System.out.println("2. Smartphone - 20000");
            System.out.println("3. Headphones - 2000");
            System.out.println("4. Smartwatch - 5000");
            System.out.println("5. Backpack - 1000");
            System.out.print("Choose product " + i + ": ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: sum += 40000; break;
                case 2: sum += 20000; break;
                case 3: sum += 2000; break;
                case 4: sum += 5000; break;
                case 5: sum += 1000; break;
                default: System.out.println("Invalid choice");
            }
        }

        if (sum > 5000) {
            sum -= sum / 10; // 10% discount
            System.out.println("10% discount applied!");
        }

        System.out.println("Final Bill = Rs. " + sum);
        sc.close();
    }
}