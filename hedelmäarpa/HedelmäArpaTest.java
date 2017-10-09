package hedelmäarpa;

import java.util.Scanner;

public class HedelmäArpaTest {

    static String arpa;
    static String peliTulos = "";
    //static int intArpa;

    public static void main(String[] args) {

        //int arvonnat = 0;
        int jatkaLoopissa = 1;
        int lukitus1;
        int lukitus2;

        Scanner input = new Scanner(System.in);

        while (jatkaLoopissa == 1) {

            System.out.println("Anna tripletti: = 1, Lopeta: = muu valinta");
            jatkaLoopissa = input.nextInt();
            peliTulos = "";
            for (int a = 1; a <= 3; a++) {

                HedelmäArpa.hedelmaArpa();
                arpa = HedelmäArpa.arpa;
                //intArpa = HedelmäArpa.intArpa;
                peliTulos = peliTulos + arpa;

            }
            System.out.println("hedelmäpelin tulos: " + peliTulos);
            System.out.println("haluatko lukita EI = 1, KYLLÄ = 2 ");
            lukitus1 = input.nextInt();
            if (lukitus1 == 2) {
                System.out.println("lukitse 1. =  1, lukitse 2. = 2, lukitse 3. = 3");
                lukitus2 = input.nextInt();

                switch (lukitus2) {
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                }
            }

        }

    }
}
