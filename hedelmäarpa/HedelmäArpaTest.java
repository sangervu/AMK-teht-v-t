package hedelmäarpa;

import java.util.Scanner;

public class HedelmäArpaTest {

    static String arpa;
    static String peliTulos = "";
    //static int intArpa;

    public static void main(String[] args) {

        //int arvonnat = 0;
        int jatkaLoopissa = 1;
        int lukitse;
        int lukitusValinta;
        char lukko = ' '; //varataan lukko muistipaikka, joka on alustettu yhdellä tyhjällä merkillä

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
                    System.out.println("lukitse 1. =  1, lukitse 2. = 2, lukitse 3. = 3");
                    lukitusValinta = input.nextInt();

                    switch (lukitusValinta) {
                        case 1: // ensmimmäinen merkki lukitaan

                            lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                            //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                            String arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                            String arpa2 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                            peliTulos = lukko + arpa1 + arpa2; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                            //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä
                            System.out.println("hedelmäpelin tulos: " + peliTulos); //tulostetaan uusi pelitulos, jossa ensimmäinen merkkki oli lukittu

                            break;

                        case 2: // toinen merkki lukitaan
                            lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                            //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                            String arpa3 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                            String arpa4 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                            peliTulos = arpa3 + lukko + arpa4; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                            //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä
                            System.out.println("hedelmäpelin tulos: " + peliTulos); //tulostetaan uusi pelitulos, jossa ensimmäinen merkkki oli lukittu
                            break;

                        case 3: // kolmas merkki lukitaan

                            lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                            //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                            String arpa5 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                            HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                            String arpa6 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                            peliTulos = arpa5 + arpa6 + lukko; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                            //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä
                            System.out.println("hedelmäpelin tulos: " + peliTulos); //tulostetaan uusi pelitulos, jossa ensimmäinen merkkki oli lukittu

                            break;

                    }
                }

            }
        }

    }
}
