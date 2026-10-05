package day06;
import java.util.Scanner;

public class From_where_to_where_PART_II {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? : ");
        int BigNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("When to? : ");
        int SmallNumber = Integer.valueOf(scanner.nextLine());

        for(int i = SmallNumber; i<=BigNumber; i++){
            System.out.println(i);
        }
    }
}
