package hedelmäarpa;

import java.util.Random;

public class HedelmäArpa {

     static String arpa;
     static int intArpa;

    /*enum Hedelmä {
        $,
        ¤,
        €,
        £,
        Q,
        Z,
        Ö,
        Ä,
    }*/

    public static void hedelmaArpa() {

        Random rnd = new Random();//hyödynnetään valmista luokkaa java.util.Random ja tehdään sille objekti

        int randInt = rnd.nextInt(8);

        switch (randInt) {
            case 0:
                System.out.println("$");
                arpa = "$";
                intArpa = 1;
                break;

            case 1:
                System.out.println("¤");
                arpa = "¤";
                intArpa = 2;
                break;
            case 2:
                System.out.println("€");
                arpa = "€";
                intArpa = 3;
                break;
            case 3:
                System.out.println("£");
                arpa = "£";
                intArpa = 4;
                break;
            case 4:
                System.out.println("Q");
                arpa = "Q";
                intArpa = 5;
                break;
            case 5:
                System.out.println("Z");
                arpa = "Z";
                intArpa = 6;
                break;
            case 6:
                System.out.println("Ö");
                arpa = "Ö";
                intArpa = 7;
                break;
            case 7:
                System.out.println("Ä");
                arpa = "Ä";
                intArpa = 8;
                break;

        }

    }
}
