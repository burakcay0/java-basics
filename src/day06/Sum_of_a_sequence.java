package day06;
import java.util.Scanner;

public class Sum_of_a_sequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last Number? : ");
        int LastNumber = Integer.valueOf(scanner.nextLine());
        int equals = 0;

        for(int i = 0; i<=LastNumber; i++){
            equals+=i;

        }
        System.out.println(equals);
    }
}
