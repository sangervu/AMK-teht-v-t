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
public class Pelimoottori {

    static Scanner lukija = new Scanner(System.in);

    private String pelitulos;
    private String valinta;
    private Voittoluokat voitinko = new Voittoluokat();

    public Pelimoottori() {
    }

    public int Peli() {
        int voitto;
        pelitulos = Merkkijonoarpoja.merkkijono();
        this.pelitulos = pelitulos;
        voitto = voitinko.tutkiVoitto(pelitulos);
        return voitto;
    }

    public int Lukitsin(int valinta) {
        int voitto;

        switch (valinta) {

            case 1:
                StringBuilder modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;

            case 2:
                modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;

            case 3:
                modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;

            case 12:
                modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(2, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;

            case 13:
                modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(1, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;

            case 23:
                modPelitulos = new StringBuilder(this.pelitulos);
                modPelitulos.setCharAt(0, Merkkijonoarpoja.merkki());
                pelitulos = modPelitulos.toString();
                this.pelitulos = pelitulos;
                voitto = voitinko.tutkiVoitto(pelitulos);
                return voitto;
            default:
                System.out.println("Virhe. Yritä uudelleen");

        }
        return 0;
    }

    public String getPelitulos() {
        return this.pelitulos;
    }
}
