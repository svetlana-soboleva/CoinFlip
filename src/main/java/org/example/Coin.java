package org.example;

import java.util.Random;
import java.util.Scanner;

public class Coin {

    public static final String HEADS = "heads";
    public static final String TAILS = "tails";

    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        if(side.equals(HEADS) || side.equals(TAILS)) {
            this.side = side;
        }
    }


    public void flipTheCoin() {
        Random random = new Random();
        if(random.nextBoolean()) {
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
    }

    public static void main(String[] args) {

        Person person = new Person();

        Scanner guessObj = new Scanner(System.in);
        System.out.println("Player 1 enter guess");

        String guess = guessObj.nextLine();

        if(! person.checkTheGuess(guess)) {
            System.out.println("Choose between tails and heads");
            return;
        }

        person.setGuess(guess);
        guessObj.close();

        Coin coin = new Coin();

        // Flip the coin and print the result
        for (int i = 0; i < 1; i++) {
            coin.flipTheCoin();
            String result = coin.getSide();
            System.out.println("Coin flip result: " + result);


            if(person.getGuess().equals(coin.getSide())) {
                System.out.println("You guessed correctly!");
            } else {
                System.out.println("Better luck next time.");
            }
        }

    }

}
