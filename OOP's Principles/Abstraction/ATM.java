package introduction.OOP.Abstraction;

import java.util.Scanner;

public class ATM extends abstractATM {
    private double balance;
    public ATM(double initialBalance) {
        super(initialBalance);
    }




    // Method to deposit money
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited: $%.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.printf("Insufficient funds. Current balance: $%.2f%n", balance);
        } else {
            balance -= amount;
            System.out.printf("Successfully withdraw: $%.2f%n", amount);
        }
    }

    // Method to check the current balance
    @Override
    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public void start(){
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    this.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    this.withdraw(withdrawAmount);
                    break;
                case 3:
                    this.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
