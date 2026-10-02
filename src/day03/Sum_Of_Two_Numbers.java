package day03;
import java.util.Scanner;

public class Sum_Of_Two_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sum = first + second;
        System.out.println("The sum of the numbers is  " + sum);
    }
}
