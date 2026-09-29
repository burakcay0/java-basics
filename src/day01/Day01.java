package day01;

import java.util.Scanner;

public class Day01{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.valueOf(scanner.nextLine());

        System.out.println("name: " + name + " age: " + age);

        double number1 = 10;
        double number2 = 18;
        double sum = number1 + number2;

        System.out.println("2 double number equals: " + sum);

        int balance = 1000;
        int new_balance = balance - 250;

        System.out.println("new balance: " + new_balance);
    }
}
