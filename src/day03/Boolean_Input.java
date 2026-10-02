package day03;
import java.util.Scanner;

public class Boolean_Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something : ");
        boolean number = Boolean.valueOf(scanner.nextLine());

        System.out.println(number);
    }
}
