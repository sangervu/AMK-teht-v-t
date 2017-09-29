package aikaero;

import java.util.Random;
import java.util.Scanner;

public class AikaEro {

    public static void main(String[] args) {
        int aikaero;
        int h1 = 100; // annetaan alkuarvo, jotta while loop lähtisi "käyntiin"
        int m1 = 100;
        int s1 = 100;
        int h2 = 100;
        int m2 = 100;
        int s2 = 100;

        Scanner input = new Scanner(System.in);

        // while loop tarkistaa, että aika on sallituissa rajoissa 0-24
        while (h1 < 0 || h1 > 24) {
            System.out.println("Anna aika1 tunnit");
            h1 = input.nextInt();
        }
        // lisää wile loop
        System.out.println("Anna aika1 minuutit");
        m1 = input.nextInt();
        //lisää while loop
        System.out.println("Anna aika1 sekunnit");
        s1 = input.nextInt();

        System.out.println("Anna aika2 käsin = 1, anna koneen arpoa aika2 = 2");
        int valinta = input.nextInt();
        switch (valinta) {
            case 1: // tämä on manuaalinen valinta
                // näihinkin voi lisätä while loopin testaamista varten
                System.out.println("Anna aika2 tunnit");
                h2 = input.nextInt();
                System.out.println("Anna aika 2minuutit");
                m2 = input.nextInt();
                System.out.println("Anna aika 2sekunnit");
                s2 = input.nextInt();
                break;
            case 2: // tässä kone tekee valinnan (arpoo) aika2:lle

                Random rnd = new Random();//hyödynnetään valmista luokkaa java.util.Random ja tehdään sille objekti

                h2 = rnd.nextInt(24);
                m2 = rnd.nextInt(60);
                s2 = rnd.nextInt(60);
                System.out.println("Koneen antama aika2: " + h2 + "h " + m2 + "min " + s2 + "sec");

                break;
        }

        aikaero = aikaEro(h1, m1, s1, h2, m2, s2);
        System.out.println("Tulosta aikaero sekunteina: " + aikaero + " sekuntia");

    }

    //tehdään metodi samaan luokkaan. Return palauttaa kutsujalle, kts. yllä. Staattista metodia vosii kutsua mitä tahansa muustakin
    //luokasta, jos niitä olisi tässä harjoituksessa.
    public static int sekunteina(int tunnit, int minuutit, int sekunnit) {

        return (tunnit * 60 * 60 + minuutit * 60 + sekunnit);

    }

    public static int aikaEro(int h1, int min1, int sec1, int h2, int min2, int sec2) {

        int aikaEro;
        int aika1 = sekunteina(h1, min1, sec1);
        int aika2 = sekunteina(h2, min2, sec2);

        if (aika1 > aika2) {
            aikaEro = aika1 - aika2;
            return aikaEro;
        } else {
            aikaEro = aika2 - aika1;
            return aikaEro;
        }

    }

}