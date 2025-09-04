package Modifiers;

   // Base class
class BankAccount {
    public String accountNumber;    // Public → accessible everywhere
    protected String accountHolder; // Protected → accessible in same package & subclasses
    private double balance;         // Private → only inside BankAccount

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance (since balance is private)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsInfo() {
        // Can access accountNumber (public) and accountHolder (protected)
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Savings Account Holder: " + accountHolder);
        // Cannot access balance directly (private) → must use getBalance()
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Method to calculate yearly interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Yearly Interest: " + interest);
    }
}

// Test Class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "Nupur", 10000, 5.0);

        sa.displayAccountInfo();   // from base class
        sa.displaySavingsInfo();   // from subclass

        sa.deposit(2000);
        sa.withdraw(3000);

        sa.calculateInterest();    // specific to SavingsAccount
    }
}
 

