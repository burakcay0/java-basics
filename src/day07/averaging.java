package day07;

public class averaging {
    public static void main(String[] args){
        double result = averaging(4,3,6,1);
        System.out.println("Average : " + result);
    }

    public static double averaging(int number1, int number2, int number3, int number4) {
        double result = (double) (number1 + number2 + number3 + number4) / 4;
        return result;
    }
}
