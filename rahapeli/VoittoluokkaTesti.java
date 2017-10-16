/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;

import java.util.Scanner;

/**
 *
 * @author Arttu
 */
public class VoittoluokkaTesti {

    static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {

        String pelitulos;
        String valinta;
        Voittoluokat voitinko = new Voittoluokat();

        do {
            System.out.println("Kun haluat lopettaa kirjoita lopeta, muuten paina enter");
            valinta = lukija.nextLine();
            //pelitulos = lukija.nextLine();
            pelitulos = Merkkijonoarpoja.merkkijono();
            
            if (voitinko.tutkiVoitto(pelitulos) != 0) {
                System.out.println(pelitulos);
                System.out.println(voitinko.tutkiVoitto(pelitulos));
            } else if (valinta.equals("lopeta")) {
             break;   
            } else {
                System.out.println(pelitulos);
                System.out.println("Ei voittoa, lukitaanko merkkejä vai jatketaanko lukitsematta?\n"
                        + "0=jatka lukitsematta\n"
                        + "muutoin syötä lukittava merkki tai merkit numeroina\n"
                        + "esim 1 lukitsee 1. merkin, 13 lukitsee 1. ja 3. merkin");

                int valitsin = Integer.parseInt(lukija.nextLine());
                switch (valitsin) {
                    case 1:
                        StringBuilder modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                        modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 2:
                        modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                        modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 3:
                        modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                        modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 12:
                        modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 13:
                        modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 23:
                        modPelitulos = new StringBuilder(pelitulos);
                        modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                        pelitulos = modPelitulos.toString();
                        System.out.println(pelitulos);
                        voitinko.tutkiVoitto(pelitulos);
                        if (voitinko.tutkiVoitto(pelitulos) != 0) {
                            System.out.println(voitinko.tutkiVoitto(pelitulos));
                        } else {
                            System.out.println("Ei voittoa");
                        }
                        break;

                    case 0:
                        continue;
                }
            }

        } while (!valinta.equals("lopeta"));

    }

}

