package day10;
import java.util.Scanner;

public class nameOfTheOldest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a name and age: ");
        int oldest = 0;
        String oldestName = "";

        while(true){
            String nameAndAge = scanner.nextLine();
            if(nameAndAge.equals("")){
                break;
            }
            String[] parts = nameAndAge.split(",");
            int age = Integer.valueOf(parts[1]);
            String name = parts[0];

            if(age>oldest){
                oldest = age;
                oldestName = name;
            }

        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
