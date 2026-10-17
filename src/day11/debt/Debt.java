package day11.debt;

public class Debt {
    private double balance;
    private double interestRate;
    private double debt;

    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        debt = this.balance * this.interestRate;
        this.balance = debt;
    }
}
