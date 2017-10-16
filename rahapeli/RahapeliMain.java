/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;


import java.util.*;

/**
 *
 * @author Arttu
 */
public class RahapeliMain {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        RahanSyotto rahasyotto = new RahanSyotto();
        PanosSyotto panosyotto = new PanosSyotto();
        Voittoluokat voitinko = new Voittoluokat();
        Pelimoottori peli = new Pelimoottori();

        int syottoraha, valinta, nollaa, voittoraha;
        int kokonaissaldo;
        char toiminto=1;
        String pelitulos;

        //eka kierros
        System.out.println("Tervetuloa pelaamaan vuosisadan onnistuneinta peliprojektia. Kaikki voittaa!!!!!!");
        System.out.println("Voittoluokat:\n"
                + "%%% = palauttaa panoksen\n"
                + "$$$ = 5-25\n"
                + "€€€ = 10-50\n"
                + "£££ = 20-100\n"
                + "BBB = 200-1000");
        rahasyotto.ekaSyotto();
        panosyotto.ekaPanos(rahasyotto.syottoSaldo.kokoSaldo());

        //PELI TULEE TÄHÄNyotto.panos;
        rahasyotto.syottoSaldo.vahennaSaldoa(panosyotto.panos);
        voittoraha = peli.Peli() * panosyotto.panos;
        rahasyotto.syottoSaldo.lisaaVoittosaldo(voittoraha);
        System.out.println("Peli arpoi sinulle rivin " + peli.getPelitulos() + " voitit " + voittoraha + " auvoa");
        System.out.println("Sinulla on syötettyä rahaa jäljellä: " + rahasyotto.syottoSaldo.getSyottoSaldo() + "\nVoittosi tähän asti: " + rahasyotto.syottoSaldo.getVoittoSaldo());
        System.out.println("Voittoluokat:\n"
                + "%%% = palauttaa panoksen\n"
                + "$$$ = 5-25\n"
                + "€€€ = 10-50\n"
                + "£££ = 20-100\n"
                + "BBB = 200-1000");
        if (voittoraha == 0 && rahasyotto.syottoSaldo.kokoSaldo() > 0) {

            System.out.println("Ei voittoa. 0=jatka lukitsematta\n"
                    + "muutoin syötä lukittava merkki tai merkit numeroina\n"
                    + "esim 1 lukitsee 1. merkin, 13 lukitsee 1. ja 3. merkin");
            valinta = Integer.parseInt(lukija.nextLine());
            if (valinta != 0 && rahasyotto.syottoSaldo.voikoVahentaa(panosyotto.panos) == true) {
                rahasyotto.syottoSaldo.vahennaSaldoa(panosyotto.panos);
                voittoraha = panosyotto.panos * peli.Lukitsin(valinta);
                rahasyotto.syottoSaldo.lisaaVoittosaldo(voittoraha);
                System.out.println("Peli arpoi sinulle rivin " + peli.getPelitulos() + "voitit " + voittoraha + " auvoa");

            } else {

            }
        }
        System.out.println("Sinulla on syötettyä rahaa jäljellä: " + rahasyotto.syottoSaldo.getSyottoSaldo() + "\nVoittosi tähän asti: " + rahasyotto.syottoSaldo.getVoittoSaldo());

        //muut kierrokset
        
        while (rahasyotto.syottoSaldo.kokoSaldo() > 0 && toiminto != 's'){
            System.out.println("\nMitä haluat tehdä?\n1 = Jatka pelaamista\n2 = Ota voitot");
            toiminto = lukija.next().charAt(0);
            switch (toiminto) {
                case '1'://jatka pelaamista
                    char uusiSyotto;
                    char uusiPanos;

                    do {
                        do {
                            System.out.println("Lisätäänkö syöttörahaa (k/e?)");
                            uusiSyotto = lukija.next().charAt(0);

                            switch (uusiSyotto) {
                                case 'k':
                                case 'K':
                                    rahasyotto.ekaSyotto();
                                    break;
                                case 'e':
                                case 'E':
                                    break;
                                default:
                                    System.out.println("Virhe");
                            }
                        } while (uusiSyotto != 'k' && uusiSyotto != 'K' && uusiSyotto != 'e' && uusiSyotto != 'E');

                        do {
                            System.out.println("Muutetaanko panoksia (k/e?)");
                            uusiPanos = lukija.next().charAt(0);

                            switch (uusiPanos) {
                                case 'k':
                                case 'K':

                                    panosyotto.ekaPanos(rahasyotto.syottoSaldo.kokoSaldo());

                                    break;

                                case 'e':
                                case 'E':
                                    break;
                                default:
                                    System.out.println("Virhe");
                            }
                        } while (uusiPanos != 'k' && uusiPanos != 'K' && uusiPanos != 'e' && uusiPanos != 'E');
                        if (rahasyotto.syottoSaldo.voikoVahentaa(panosyotto.panos) == false) {
                            System.out.println("Rahhaa ee riittä!!! lisä raha tae muutta panosta");
                        } else {
                            break;
                        }
                    } while (rahasyotto.syottoSaldo.voikoVahentaa(panosyotto.panos) == false);
                    rahasyotto.syottoSaldo.vahennaSaldoa(panosyotto.panos);
                    voittoraha = peli.Peli() * panosyotto.panos;
                    rahasyotto.syottoSaldo.lisaaVoittosaldo(voittoraha);
                    System.out.println("Peli arpoi sinulle rivin " + peli.getPelitulos() + " voitit " + voittoraha + " auvoa");
                    System.out.println("Sinulla on syötettyä rahaa jäljellä: " + rahasyotto.syottoSaldo.getSyottoSaldo() + "\nVoittosi tähän asti: " + rahasyotto.syottoSaldo.getVoittoSaldo());
                    System.out.println("Voittoluokat:\n"
                            + "%%% = palauttaa panoksen\n"
                            + "$$$ = 5-25\n"
                            + "€€€ = 10-50\n"
                            + "£££ = 20-100\n"
                            + "BBB = 200-1000");
                    if (voittoraha == 0 && rahasyotto.syottoSaldo.kokoSaldo() > 0) {

                        System.out.println("Ei voittoa. 0=jatka lukitsematta\n"
                                + "muutoin syötä lukittava merkki tai merkit numeroina\n"
                                + "esim 1 lukitsee 1. merkin, 13 lukitsee 1. ja 3. merkin");
                        valinta = lukija.nextInt();
                        if (valinta != 0 && rahasyotto.syottoSaldo.voikoVahentaa(panosyotto.panos) == true) {
                            rahasyotto.syottoSaldo.vahennaSaldoa(panosyotto.panos);
                            voittoraha = panosyotto.panos * peli.Lukitsin(valinta);
                            rahasyotto.syottoSaldo.lisaaVoittosaldo(voittoraha);
                            System.out.println("Peli arpoi sinulle rivin " + peli.getPelitulos() + "voitit " + voittoraha + " auvoa");
                        } else {

                        }
                    }
                    System.out.println("Sinulla on syötettyä rahaa jäljellä: " + rahasyotto.syottoSaldo.getSyottoSaldo() + "\nVoittosi tähän asti: " + rahasyotto.syottoSaldo.getVoittoSaldo());
                    System.out.println("Olet voittanut " + voittoraha + " rahaa\nSinulla on " + rahasyotto.syottoSaldo.getSyottoSaldo() + " rahaa käytettävänä");
                    //System.out.println("kokosaldo on " + rahasyotto.syottoSaldo.kokoSaldo());
                    break;
                case '2'://ota voitot
                    int uusRaha = 0;
                    System.out.println("Olet voittanut " + rahasyotto.syottoSaldo.getVoittoSaldo() + " auvoa");
                    rahasyotto.syottoSaldo.setVoittoSaldo(uusRaha);
                    break;
                default:
                    System.out.println("Virhe. Yritä uudelleen.");
            }
            

        } 
    }

}