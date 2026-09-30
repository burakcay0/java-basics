package day02;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi");
        String first = scanner.nextLine();
        System.out.println("What is your name?");
        String second = scanner.nextLine();
        System.out.println("Nice to meet you, I am Ada");
        String third = scanner.nextLine();
    }
}
