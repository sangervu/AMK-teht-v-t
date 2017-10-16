/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arttu
 */
public class Tuplaus {

    public static Random arpoja = new Random();
    public static Scanner lukija = new Scanner (System.in);

    public static char arpoja() {

        char arpa;
        int arvontaluku = 1 + arpoja.nextInt(100);
        
        if (arvontaluku  <= 45){
            arpa = '#';
        }else if (arvontaluku >= 50){
            arpa = '*';
        }else{arpa = '|';
        }
        
        return arpa;
        }
    
    public static boolean tuplaus (char valinta){
        boolean tuplaus = false;
        char i = arpoja();
        if(i==valinta && i != '|'){
            tuplaus = true;
        }
        return tuplaus;
    }
        
      public static void main(String[] args) {
          char valinta;
          do{System.out.println("Syötä tuplausvalinta # tai *");
          valinta = lukija.nextLine().charAt(0);
              System.out.println("Tuplaus tulos: " + arpoja() + "valitsit " + valinta);
          System.out.println(tuplaus(valinta));
          }while(valinta !=0);
        
    }
 }
