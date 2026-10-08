package day08;
import java.util.ArrayList;
import java.util.Scanner;

public class secondPlusThird {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            System.out.println("Give a number : ");
            int number = Integer.valueOf(scanner.nextLine());
            list.add(number);
            if(number == 0){
                break;
            }
        }
        int sum = list.get(1) + list.get(2);
        System.out.println(sum);
    }
}
