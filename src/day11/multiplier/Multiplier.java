package day11.multiplier;

public class Multiplier {
    private int value;
    private int x = 0;
    public Multiplier(int number){
        this.value = number;
    }

    public int multiply(int number){
        x = this.value * number;
        return x;
    }

}
