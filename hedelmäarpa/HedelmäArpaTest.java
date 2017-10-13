package hedelmäarpa;

import java.util.Scanner;

public class HedelmäArpaTest {

    static String peliTulos = "";

    //static int intArpa;
    public static void main(String[] args) {

        //int arvonnat = 0;
        String arpa;
        int jatkaLoopissa = 1;
        int lukitse;

        Scanner input = new Scanner(System.in);

        while (jatkaLoopissa == 1) {

            System.out.println("Anna tripletti: = 1, Lopeta: = muu valinta");
            jatkaLoopissa = input.nextInt();

            if (jatkaLoopissa == 1) { // hypätään tämän yli jos valinta on "Lopeta"
                peliTulos = "";
                for (int a = 1; a <= 3; a++) {

                    HedelmäArpa.hedelmaArpa();
                    arpa = HedelmäArpa.arpa;
                    //intArpa = HedelmäArpa.intArpa;
                    peliTulos = peliTulos + arpa;

                }
                System.out.println("hedelmäpelin tulos: " + peliTulos);
                System.out.println("haluatko lukita EI = 1, KYLLÄ = 2 ");

                lukitse = input.nextInt();

                if (lukitse == 2) {

                    System.out.println("haluatko lukita yhden merkin:  = 1, haluatko lukita kaksi merkkiä:  = 2");
                    int lukitseYksiTaiKaksi = input.nextInt();

                    switch (lukitseYksiTaiKaksi) {

                        case 1:

                            ArpaLukitus1 lukitus1 = new ArpaLukitus1(peliTulos);
                            peliTulos = lukitus1.peliTulos;
                            System.out.println("hedelmäpelin tulos: " + peliTulos); //tulostetaan uusi pelitulos, jossa ensimmäinen merkkki oli lukittu
                            break;

                        case 2:

                            ArpaLukitus2 lukitus2 = new ArpaLukitus2(peliTulos);
                            peliTulos = lukitus2.peliTulos;
                            System.out.println("hedelmäpelin tulos: " + peliTulos); //tulostetaan uusi pelitulos, jossa ensimmäinen merkkki oli lukittu

                            break;

                    }

                } else {

                }

            }

        }
    }
}
