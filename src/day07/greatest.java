package day07;

public class greatest {
    public static void main(String[] args){
        int answer = greatest(3,5,7);
        System.out.println("Greatest : " + answer);
    }

    public static int greatest(int number1, int number2, int number3){
        if(number1>number2 && number1>number3){
            return number1;
        }
        else if(number2>number1 && number2>number3){
            return number2;
        }
        else{
            return number3;
        }
    }
}
