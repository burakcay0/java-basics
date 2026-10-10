package day08;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class indexOfSmallest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Give a number/numbers : ");

        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            }
            list.add(number);
        }
        int smallest = list.get(0);
        for(int i = 0; i<list.size(); i++){
            int current = list.get(i);
            if(current<smallest){
                smallest = current;
            }
        }
        System.out.println("Smallest number : " + smallest);
        for(int j = 0; j<list.size(); j++){
            int member = list.get(j);
            if(member == smallest){
                System.out.println("Found at index : " + j);
            }
        }
    }
}
