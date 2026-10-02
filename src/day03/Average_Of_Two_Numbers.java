package day03;
import java.util.Scanner;

public class Average_Of_Two_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        double second = Double.valueOf(scanner.nextLine());

        double average = (first + second ) / 2;

        System.out.println("The average is  " + average);
    }
}
