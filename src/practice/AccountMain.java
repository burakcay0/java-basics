package practice;

public class AccountMain {
    public static void main(String[] args){
        Account account = new Account("TR001", "Burak");

        account.deposit(200);
        account.withdraw(50);
        System.out.println(account.toString());

        account.withdraw(500);
        System.out.println(account.toString());
    }
}
