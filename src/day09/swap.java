package day09;
import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println(" Give two indices to swap: ");
        int index_one = Integer.valueOf(scanner.nextLine());
        int index_two = Integer.valueOf(scanner.nextLine());
        System.out.println();
        int helper = numbers[index_one];
        numbers[index_one] = numbers[index_two];
        numbers[index_two] = helper;

        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
