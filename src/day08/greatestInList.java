package day08;
import java.util.ArrayList;
import java.util.Scanner;

public class greatestInList {
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
        int greatest = list.get(0);
        for(int i = 0; i< list.size(); i++){
            int current = list.get(i);
            if(current>greatest){
                greatest = current;
            }
        }
        System.out.println("The greatest number : " + greatest);
    }
}
