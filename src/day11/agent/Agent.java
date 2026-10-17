package day11.agent;

public class Agent {
    private String name;
    private String surname;

    public Agent(String names, String surnames) {
        this.name = names;
        this.surname = surnames;
    }

    public String toString(){
        return  "My name is " + this.surname + "," + " " + this.name + " " + this.surname;
    }
}
