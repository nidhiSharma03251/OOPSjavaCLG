import java.util.Scanner;

public class InnerBankAccount {
    
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.next();

        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount h = new BankAccount(accountNumber, accountHolderName, balance);

        System.out.println("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        System.out.println("Enter amount to withdraw: ");   
        double withdrawAmount = sc.nextDouble();

        h.deposit(depositAmount);
        h.withdraw(withdrawAmount);
        h.currentBalance();
        sc.close();
    }
}

