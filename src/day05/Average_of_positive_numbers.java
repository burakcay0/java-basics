package day05;
import java.util.Scanner;

public class Average_of_positive_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int NumberofPozitive = 0;
        int NumberofNegative = 0;
        int AveragePozitive = 0;
        double ones = 0;

        while(true){
            System.out.println("Give a number : ");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            }

            if(number>0){
                NumberofPozitive = NumberofPozitive + number;
                ones+=1;
            }

        }
        System.out.println(NumberofPozitive / ones);
    }
}
