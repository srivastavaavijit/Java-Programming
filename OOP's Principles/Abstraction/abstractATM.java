package introduction.OOP.Abstraction;

public abstract class abstractATM {

    private double balance;

    public abstractATM(double initialBalance){
        this.balance = initialBalance;
        greeting();
    }

    public static void greeting(){
        System.out.println("Welcome to ATM!");
    }

    // Method to deposit money
    public abstract void deposit(double amount);

    // Method to withdraw money
    public abstract void withdraw(double amount);

    public abstract void checkBalance();

}
