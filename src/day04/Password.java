package day04;
import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String pass = scanner.nextLine();

        if(pass.equals("Burak")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Off with you");
        }
    }
}
