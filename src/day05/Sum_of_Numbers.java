package day05;
import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        int NumberofPozitives = 0;
        int NumberofNegatives = 0;

        while(true){
            System.out.println("Give a number : ");
            int number = Integer.valueOf(scanner.nextLine());

            if(number==0){
                break;
            }

            if(number>0){
                NumberofPozitives = NumberofPozitives + number;
            }
            else{
                NumberofNegatives = NumberofNegatives + number;
            }
        }

        System.out.println("Sum of the numbers : " + (NumberofPozitives + NumberofNegatives));
    }
}
