package day03;
import java.util.Scanner;

public class Double_Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a mumber : ");
        double number = Double.valueOf(scanner.nextLine());

        System.out.println("You gave a number   " + number);
    }
}
