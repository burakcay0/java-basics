package day04;
import java.util.Scanner;

public class Checking_the_age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you");
        int age = Integer.valueOf(scanner.nextLine());

        if(age<0){
            System.out.println("Impossible");
        }
        else if(age<120){
            System.out.println("OK");
        }
        else if(age>120){
            System.out.println("Impossible");
        }
    }
}
