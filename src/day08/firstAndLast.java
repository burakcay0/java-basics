package day08;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class firstAndLast {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Give a name/names");

        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(name);
        }
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}
