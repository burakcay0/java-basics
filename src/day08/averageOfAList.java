package day08;
import java.util.Scanner;
import java.util.ArrayList;

public class averageOfAList {
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
        double sum = 0;
        double average = 0;
        for(int i = 0; i<list.size(); i++){
            sum+=list.get(i);
            average = sum / list.size();
        }
        System.out.println("Average : " + average);
    }
}
