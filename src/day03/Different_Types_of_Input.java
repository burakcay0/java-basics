package day03;
import java.util.Scanner;

public class Different_Types_of_Input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("you gave the string  " + string);
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("you gave the integer  " + integer);
        double doublee = Double.valueOf(scanner.nextLine());
        System.out.println("you gave the double  " + doublee);
        boolean booleann = Boolean.valueOf(scanner.nextLine());
        System.out.println("you gave the boolean " + booleann);

    }
}
