package day06;
import java.util.Scanner;

public class From_where_to_where_PART_I {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number : ");
        int number = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i<=number; i++){
            System.out.println(i);
        }

    }
}
