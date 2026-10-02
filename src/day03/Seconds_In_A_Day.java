package day03;
import java.util.Scanner;

public class Seconds_In_A_Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int second = 60;
        int minute = second;
        int hour = minute * second;
        int day = hour * 24;

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        System.out.println(days * day);

    }
}
