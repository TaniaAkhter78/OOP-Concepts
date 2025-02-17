package encapsulation;

public class BankAccount {

//    1. Encapsulation Assignment (Banking System)
//    Scenario:
//    You are developing a banking system where customers can open a bank account and deposit or withdraw money. However, the balance should not be directly accessible from outside the class.
//    Task:
//    Create a BankAccount class.
//    Use private variables for accountNumber, accountHolderName, and balance.
//    Provide public getter methods for accountNumber and accountHolderName, but not for balance.
//    Provide methods deposit(double amount) and withdraw(double amount), ensuring that the balance cannot go negative.
//    Test the program by creating multiple accounts and performing transactions.

    // The below variables are the properties of this class

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    // For private instance variables, if we want to get the value from other class. W
    // We need to setup getter method

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // double data type can hold negative and positive values

    public void deposit(double amount) {
        // If the amount to deposit is greater than 0, then the system should make the changes
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Transaction successful");
        }
        else
            System.out.println("Invalid input amount");
    }

    public void withdraw(double amount) {
        // If account balance is less than 0 or less than the amount to withdraw, then the system should make the changes
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Transaction successful");
        } else if (amount < 0) {
            System.out.println("Invalid input amount");
        } else
            System.out.println("Insufficient funds");
    }
}
