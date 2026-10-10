package day08;
import java.util.Scanner;
import java.util.ArrayList;

public class indexOf {
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

        System.out.print("Search for? : ");
        int searched = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == searched){
                System.out.println(searched + " is at index " + i);
            }
        }
    }
}
