package day04;
import java.util.Scanner;

public class Squared {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int number = Integer.valueOf(scanner.nextLine());

        int squarednumber = number * number;
        System.out.println(squarednumber);
    }
}
