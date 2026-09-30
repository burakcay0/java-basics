package day02;

import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        System.out.println("Write a message : " + message);
        System.out.println("Write a message : " + message);
        System.out.println("Write a message : " + message);
    }
}
