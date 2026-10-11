package day10;
import java.sql.SQLOutput;
import java.util.Scanner;

public class personalDetails {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sumYears = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String nameAndBirth = scanner.nextLine();
            if (nameAndBirth.isEmpty()) {
                break;
            }

            String[] parts = nameAndBirth.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);

            sumYears += year;
            count++;

            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        double average = (double) sumYears / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
