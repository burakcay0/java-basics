package day03;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        double second = Double.valueOf(scanner.nextLine());

        double sum = first + second;
        double diff = first - second;
        double multiplication = first * second;
        double division = first / second;

        System.out.println(first + " + " + second + " = " + sum);
        System.out.println(first + "-" + second + " = " + diff);
        System.out.println(first + "*" + second + " = " + multiplication);
        System.out.println(first + "/" + second + " = " + division);
    }
}
