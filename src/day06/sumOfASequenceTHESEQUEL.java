package day06;
import java.util.Scanner;

public class sumOfASequenceTHESEQUEL {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? : ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number? : ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int equals = 0;

        for(int i = firstNumber; i<=secondNumber; i++){
            equals+=i;
        }
        System.out.println(equals);
    }
}
