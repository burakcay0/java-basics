package day08;
import org.w3c.dom.ls.LSOutput;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class thirdElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            System.out.println("Give a name : ");
            String name = scanner.nextLine();
            list.add(name);
            if(name == ""){
                break;
            }
        }
        System.out.println(list.get(2));
    }
}
