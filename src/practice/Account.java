package practice;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            this.balance-=amount;
        }
    }

    public String toString(){
        return accountNumber + " - " + ownerName + " - balance: " + balance;
    }
}
