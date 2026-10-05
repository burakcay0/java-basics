package day06;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers : ");
        int sum = 0;
        int number = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while(true){
            int numbers = Integer.valueOf(scanner.nextLine());

            if(numbers == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum+=numbers;
            number+=1;
            average = (sum / number);

            if(numbers%2 == 0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }

        System.out.println("Sum : " + sum);
        System.out.println("Numbers : " + number);
        System.out.println("Average : " + average);
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
