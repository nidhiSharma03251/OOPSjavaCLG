import java.util.Scanner;

class BankAccount{
    private int accountNumber;
    private String accountHolderName;  
    private double balance; 


    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance = balance + amount;
        System.out.println("Deposit: " + amount);
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }else{
            this.balance = balance - amount;
        }
        System.out.println("Withdraw: " + amount);
    }

    public void currentBalance(){
        System.out.println("Current Balance: " + balance);
    }   
}
