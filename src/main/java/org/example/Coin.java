package org.example;

import java.util.Random;

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
        setSide(random.nextBoolean() ? HEADS : TAILS);
    }
}
