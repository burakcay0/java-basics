package day04;
import java.util.Scanner;

public class Comparing_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        int second = Integer.valueOf(scanner.nextLine());

        if(first>second){
            System.out.println(first + " is greater than " + second);
        }
        else if(first<second){
            System.out.println(first + " is smaller than " + second);
        }
    }
}
