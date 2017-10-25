package pii;

import java.util.Random;

public class RandomSign {

    public double x;
    public double y;

    public RandomSign() {
        this.x = Math.random() * getRandomSign();
        this.y = Math.random() * getRandomSign();
    }

    public int getRandomSign() {

        Random rand = new Random();

        if (rand.nextBoolean()) {
            return -1;
        } else {
            return 1;
        }

    }

}
