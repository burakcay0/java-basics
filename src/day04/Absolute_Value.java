package day04;
import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int number = Integer.valueOf(scanner.nextLine());

        if(number<0){
            number = number * -1;
            System.out.println(number);
        }
        else{
            System.out.println(number);
        }
    }
}
