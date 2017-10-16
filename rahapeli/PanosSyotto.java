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
public class PanosSyotto {

    static Scanner lukija = new Scanner(System.in);
    int panos;

    public int ekaPanos(int rahaaJaljella) {
        boolean panosOK;
        do {
            System.out.println("Valitse panoksesi (1-5)");
            panos = lukija.nextInt();
            panosOK=panos>=1&&panos<=5&&panos<=rahaaJaljella;
            if(!panosOK){
                System.out.println("Virhe. Panos ei ole välillä 1-5 tai panos on liian suuri verrattuna syötettyyn rahaan. Syötä panos uudelleen.");
            }
        } while (!panosOK);
        return panos;
    }

}

