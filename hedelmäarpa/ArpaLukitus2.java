package hedelmäarpa;

import java.util.Scanner;

public class ArpaLukitus2 {

    public String peliTulos;

    public ArpaLukitus2(String peliTulos) {
        int lukitusValinta;

        char lukko1 = ' '; //varataan lukko muistipaikka, joka on alustettu yhdellä tyhjällä merkillä
        char lukko2 = ' ';
        char lukko3 = ' ';
        String arpa1 = "";
        String arpa2 = "";
        Scanner input = new Scanner(System.in);

        System.out.println("lukitse (1. ja 2.) = 1, lukitse (1. ja 3.) = 2, lukitse (2. ja 3.) = 3");
        lukitusValinta = input.nextInt();
        //arpa1 = "";

        switch (lukitusValinta) {
            case 1:// ensmimmäinen ja toinen merkki lukitaan
                lukko1 = peliTulos.charAt(lukitusValinta - 1); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä
                lukko2 = peliTulos.charAt(lukitusValinta);
                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                this.peliTulos = " " + lukko1 + lukko2 + arpa1; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä

                break;

            case 2: // ensimmäinen ja kolmas merkki lukitaan
                lukko1 = peliTulos.charAt(lukitusValinta - 2); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä
                lukko3 = peliTulos.charAt(lukitusValinta);

                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                this.peliTulos = " " + lukko1 + arpa1 + lukko3; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä
                break;

            case 3: // toinen ja kolmas merkki lukitaan

                lukko2 = peliTulos.charAt(lukitusValinta - 2); // kirjotetaan ensimmäinen merkki muistiin muistipaikaan lukko.
                //lukko sisältää vain yhden char merkin, joka on ensimmäinen hedelmä tripletissä
                lukko3 = peliTulos.charAt(lukitusValinta - 1);
                HedelmäArpa.hedelmaArpa(); // "heitetään" arpaa merkille 2
                arpa1 = HedelmäArpa.arpa; // sijoitetaan saatu arvan tulos "arpa1" String muuttujaan

                this.peliTulos = " " + arpa1 + lukko2 + lukko3; // summataan muistipaikkojen lukko, arpa1 ja arpa2 tulokset yhteen.
                //Jokaisessa muistipaikassa on vain vain character muistissa, jolloin summassa on kolme char merkkiä

                break;

        }
    }

}
