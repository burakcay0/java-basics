package day05;
import java.util.Scanner;

public class Number_of_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ones = 0;

        while(true){
            System.out.println("Give a number:\n");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            }

            else if(number>0){
                ones+=1;
            }

            else if(number<0){
                System.out.println("");
                ones+=1;
            }
        }

        System.out.println("The total of ones: " + ones);
    }
}
