package day03;
import java.util.Scanner;

public class Average_Of_Three_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        double second = Double.valueOf(scanner.nextLine());
        System.out.println("Give a third number");
        double third = Double.valueOf(scanner.nextLine());

        double average = (first + second + third ) / 3;

        System.out.println("The average is  " + average);
    }
}
