import java.util.ArrayList;

class Customer {
    String name;
    ArrayList<Double> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (int i = 0; i < accounts.size(); i++)
            System.out.println("Account " + (i+1) + " Balance: " + accounts.get(i));
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, double initialDeposit) {
        customer.accounts.add(initialDeposit);
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");

        bank.openAccount(cust1, 1000);
        bank.openAccount(cust1, 500);
        bank.openAccount(cust2, 2000);

        cust1.viewBalance();
        cust2.viewBalance();
    }
}
