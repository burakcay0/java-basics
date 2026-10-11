package day09;
import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[8];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 15;
        numbers[3] = 42;
        numbers[4] = 3;
        numbers[5] = 55;
        numbers[6] = 2;
        numbers[7] = 7;

        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();

        System.out.print(" Search for? : ");
        int searched = Integer.valueOf(scanner.nextLine());
        boolean found = false;

        for(int j = 0; j<numbers.length; j++){
            if(searched == numbers[j]){
                System.out.println(searched + " is at index " + j);
                found = true;
            }
        }

        if(!found){
            System.out.println(searched + " was not found. ");
        }

    }
}
