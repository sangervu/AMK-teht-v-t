package summa;

import java.util.Scanner;

public class Summa {

    public static int summaPosParillinen;

    public static void main(String[] args) {

        int kokonaislukuPos;
        Scanner input = new Scanner(System.in);

        System.out.println("Anna luku: ");
        kokonaislukuPos = input.nextInt();

        summaPosParillinen = summaPosPar(kokonaislukuPos);

        System.out.println("Lukua " + kokonaislukuPos + " pienempien parillisten positiivisten lukujen summa on " + summaPosParillinen);
    }

    //tällä metodilla lasketaan positiivisten parillisten lukujen summa
    public static int summaPosPar(int a) {

        if (a < 0) {
            return -99;
        } else {
            // kopion tämän koodinpätkän netistä :-)
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    //System.out.println("Summan blir : " + i);
                    sum = sum + i;
                }
            }
            return sum;
        }
    }

}
