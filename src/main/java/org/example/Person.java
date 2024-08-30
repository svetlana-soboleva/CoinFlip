package org.example;

public class Person {

    private String name;
    private String guess;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public boolean checkTheGuess(String guess) {
        return guess.equals("heads") || guess.equals("tails");
    }
}
