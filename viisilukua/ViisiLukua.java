package viisilukua;

import java.util.Scanner;


public class ViisiLukua {

    static int oikeaLuku=0;
    static int luku;
    public static void main(String[] args) {
        
    for(int x=1;x<=5;x++){   
    oikeaLuku = oikeaLuku+LueJaTarkasta(); 
    }
    System.out.println("oikea luku = "+oikeaLuku);
    }
    
    static int LueJaTarkasta(){
    Scanner input = new Scanner(System.in);
    System.out.println("lue positiivinen kokonaisluku ja tarkasta");
    luku = input.nextInt();
    
    while(luku<0){
     System.out.println("virheellinen luku, syötä uusi luku");
     luku = input.nextInt();
     }
    return luku;
    }
}
