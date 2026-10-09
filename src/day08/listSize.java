package day08;
import java.util.ArrayList;
import java.util.Scanner;

public class listSize {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Give a name/names : ");

        while(true){
            String name = scanner.nextLine();

            if(name.isEmpty()){
                break;
            }
            list.add(name);
        }
        System.out.println(list.size());
    }
}
