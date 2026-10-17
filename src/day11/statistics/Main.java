package day11.statistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //PART 1
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());

        //PART 2
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());

        //PART 3
//        Statistics statistics = new Statistics();
//        System.out.println("Enter numbers : ");
//
//        while(true){
//            int number = Integer.valueOf(scanner.nextLine());
//            if(number == -1){
//                break;
//            }
//                statistics.addNumber(number);
//        }
//        System.out.println("sum : " + statistics.sum());

        //PART 4
        Statistics all  = new Statistics();
        Statistics even = new Statistics();
        Statistics odd  = new Statistics();
        Statistics statistics = new Statistics();
        System.out.println();
        System.out.println("Enter numbers : ");

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            else if(number % 2 == 0){
                even.addNumber(number);
            }
            else if(number % 2 != 0){
                odd.addNumber(number);
            }
                statistics.addNumber(number);
        }
        System.out.println("sum : " + statistics.sum());
        System.out.println("Sum of even numbers : " + even.sum());
        System.out.println("Sum of odd numbers : " + odd.sum());
    }
}
