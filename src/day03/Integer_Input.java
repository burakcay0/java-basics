package day03;
import java.util.Scanner;

public class Integer_Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a mumber : ");
        String number = scanner.nextLine();

        System.out.println("You gave a number   " + number);

    }
}
