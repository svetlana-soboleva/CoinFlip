package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Coin coin = new Coin();
        Person person = new Person();

        Scanner guessObj = new Scanner(System.in);
        System.out.println("Player 1, enter your guess! ");

        String guess = guessObj.nextLine();
        if(!person.checkTheGuess(guess)) {

            System.out.println("Invalid guess. Please choose between 'heads' and 'tails'");
            guessObj.close();
            return;
        }
        person.setGuess(guess);
        coin.flipTheCoin();
        String result = coin.getSide();
        System.out.println("Coin flip result: " + result);

        if(person.getGuess().equals(result)) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You lost. ");
        }
        guessObj.close();
    }
}
