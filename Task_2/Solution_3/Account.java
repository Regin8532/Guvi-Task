package Task_2.Solution_3;

//1.3) Create Class Account with data member as Balance. Create two constructors (no argument, and with argument) and perform following task
//a. method to deposit the amount to the account.
//b. method to withdraw the amount from the account.
//C. method to display the Balance
public class Account {
    private double balance;
    Account(){
        balance=0.0;
    }
    Account(double balance){
        this.balance=balance;
    }
    void displayBalance(){
        System.out.println("Available Balance: "+balance);
    }
    void withdrawAmount(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount Withdrawn: "+amount);
        }
    }
    void depositAmount(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited: "+amount);
        }else {
            System.out.println("Insufficient Balance.");
        }
    }
}
//Output:
//Available Balance: 0.0
//Amount deposited: 25000.0
//Amount Withdrawn: 12500.5
//Available Balance: 12499.5
//****************************************************************
//Available Balance: 20000.5
//Amount deposited: 25000.0
//Amount Withdrawn: 12500.5
//Available Balance: 32500.0
class Main{
    public static void main(String[] args) {
        Account a1=new Account();
        a1.displayBalance();
        a1.depositAmount(25000.0);
        a1.withdrawAmount(12500.50);
        a1.displayBalance();
        System.out.println("****************************************************************");
        Account a2=new Account(20000.50);

        a2.displayBalance();
        a2.depositAmount(25000.0);
        a2.withdrawAmount(12500.50);
        a2.displayBalance();
    }
}