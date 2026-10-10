package day08;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class sumOfAList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Give a number/numbers : ");

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            list.add(number);
        }
        int sum = 0;
        for(int i = 0; i<list.size(); i++){
            sum+=list.get(i);
        }
        System.out.println("Sum : " + sum);
    }
}
