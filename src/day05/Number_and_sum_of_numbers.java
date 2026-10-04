package day05;
import java.util.Scanner;

public class Number_and_sum_of_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int NumberofPositive = 0;
        int NumberofNegative = 0;
        int ones = 0;

        while(true){
            System.out.println("Give a number : ");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            }

            if(number>0){
                NumberofPositive = NumberofPositive + number;
                ones+=1;
            }
            else{
                NumberofNegative = NumberofNegative + number;
                ones+=1;
            }
        }

        System.out.println("Number of numbers : " + ones);
        System.out.println("Sum of the numbers : " + (NumberofPositive + NumberofNegative));
    }
}
