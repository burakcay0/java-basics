package day04;
import java.util.Scanner;

public class Square_root_of_sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number");
        double first = Double.valueOf(scanner.nextLine());
        System.out.println("Give a second number");
        double second = Double.valueOf(scanner.nextLine());

        double sumsquare = Math.sqrt(first + second);

        System.out.println(sumsquare);
    }
}
