package day07;

public class summation {
    public static void main(String[] args){
        int answer = sum(3,4,5,6);
        System.out.println("Sum : " + answer);
    }

    public static int sum(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }
}
