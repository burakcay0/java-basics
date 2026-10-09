package day08;
import java.util.ArrayList;
import java.util.Scanner;

public class rememberTheseNumbers {
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
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
