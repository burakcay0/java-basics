package day10;
import java.util.Scanner;

public class firstWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] slice = text.split(" ");
        System.out.println(slice[0]);
    }
}
