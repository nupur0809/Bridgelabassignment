import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        int[] transactions = new int[n];
        int balance = 0;
        int deposit = 0;
        int withdrawal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter transaction " + (i + 1) + ": ");
            transactions[i] = sc.nextInt(); 

            balance += transactions[i];

            if (transactions[i] > 0) {
                deposit += transactions[i];
            } else {
                withdrawal += transactions[i]; 
            }
        }

        if (balance < 0) {
            System.out.println("Overdraft!");
        } else {
            System.out.println("Balance: " + balance);
            System.out.println("Total deposit: " + deposit);
            System.out.println("Total withdrawal: " + (-withdrawal)); 
        }
    }
}