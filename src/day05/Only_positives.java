package day05;
import java.util.Scanner;

public class Only_positives {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a positive number");
            int number = Integer.valueOf(scanner.nextLine());

            if(number<0){
                System.out.println("Unsuitable number");
                continue;
            }
            else if(number == 0){
                break;
            }
        }
    }
}
