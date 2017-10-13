package hedelmäarpa;

import java.util.Scanner;

public class ArpaLukitus1 {

    public String peliTulos;

    public ArpaLukitus1(String peliTulos) {
        int lukitusValinta;

        char lukko = ' '; //varataan lukko muistipaikka, joka on alustettu yhdellä tyhjällä merkillä
        String arpa1 = "";
        String arpa2 = "";
        Scanner input = new Scanner(System.in);
        System.out.println("lukitse 1. = 1, lukitse 2. = 2, lukitse 3. = 3");
        lukitusValinta = input.nextInt();

        switch (lukitusValinta) {
            case 1: // ensmimmäinen merkki lukitaan

                lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                arpa2 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                this.peliTulos = lukko + arpa1 + arpa2; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä

                break;

            case 2: // toinen merkki lukitaan
                lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                arpa2 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                this.peliTulos = arpa1 + lukko + arpa2; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä

                break;

            case 3: // kolmas merkki lukitaan

                lukko = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 3
                arpa2 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa2" String muuttujaan

                this.peliTulos = arpa1 + arpa2 + lukko; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä

                break;

        }
    }
}
