package day08;
import java.util.Scanner;
import java.util.ArrayList;

public class onlyTheseNumbers {
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

        System.out.print("from where? : ");
        int fromWhere = Integer.valueOf(scanner.nextLine());
        System.out.print("to where? : ");
        int toWhere = Integer.valueOf(scanner.nextLine());

        System.out.println(list.get(fromWhere));
        System.out.println(list.get(toWhere));

    }
}
