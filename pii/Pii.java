package pii;

public class Pii {

    public static void main(String[] args) {

        double N = 0;
       double n = 0;

        while (N < 10000000) {

            RandomSign random = new RandomSign();
            double x = random.x;
            double y = random.y;

            N = N + 1;

            if (x * x + y * y < 1) {

                n = n + 1;
            }
        }

        System.out.println("Pii likiarvo = " + 4 * n / N);
        System.out.println("Pii tarkka arvo = " +Math.PI);
    }

}
