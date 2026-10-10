package day08;
import java.util.ArrayList;

public class removeLast {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);   // önce:  [First, Second, Third]
        removeLast(strings);
        System.out.println(strings);   // sonra: [First, Second]

    }

    public static void removeLast(ArrayList<String> strings){
        if (strings.size() == 0) {
            return;
        }
        strings.remove(strings.size() - 1);
    }
}
