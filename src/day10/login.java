package day10;
import java.util.Scanner;

public class login {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a name : ");
        String name = scanner.nextLine();
        System.out.println("Give a password");
        String pass = scanner.nextLine();

        if(name.equals("alex") && pass.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }
        else if(name.equals("emma") && pass.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }
        else{
            System.out.println("Incorrect username or password!");
        }
    }
}
