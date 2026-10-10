package day08;
import java.util.Scanner;
import java.util.ArrayList;

public class onTheList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            list.add(name);
        }

        System.out.print("Search for? : ");
        String search = scanner.nextLine();
        boolean found = list.contains(search);

        if(found){
            System.out.println(search + " was found!");
        }
        else{
            System.out.println(search + " wasn't found" );
        }

    }
}
