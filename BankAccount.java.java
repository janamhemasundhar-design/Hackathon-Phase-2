import java.util.Scanner;

class BankAccount {
    // Data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    // Check balance method
    double checkBalance() {
        return balance;
    }

    // Display account details
    void displayAccount() {
        System.out.println("\n--- Final Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read account details
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Create object using parameterized constructor
        BankAccount account = new BankAccount(
            accountNumber,
            accountHolderName,
            initialBalance
        );

        // Deposit operation
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdrawal operation
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final account details
        account.displayAccount();

        sc.close();
    }
}