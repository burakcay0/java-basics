package day10;
import java.util.Scanner;

public class AVClub {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word/words : ");

        while(true){
            String text = scanner.nextLine();
            if(text.isEmpty()){
                break;
            }
            String[] pieces = text.split(" ");
            for(int i = 0; i<pieces.length; i++){
                if(pieces[i].contains("av")){
                    System.out.println(pieces[i]);
                }
            }
        }
    }
}
