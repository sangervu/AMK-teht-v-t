package merkilliset;

import java.util.Scanner;

public class Merkillinen {

    static String merkit = "*"; // tämä oli oletusmerkki
    static String merkkijono = ""; // aloitetaan aina tyhjällä merkkijonolla
    Scanner input = new Scanner(System.in);
    
    //Tämä on "setter". this viittaa tähän omaan instanssiin (eli objektiin)
    public void setString(String a){
       this.merkit = a;
    }
    
    //Tehtävä 27 Merkillinen rivi. Tässä tehdään rivi
    void teeRivi(int pituus){
    System.out.println("tulosta valittu merkki valitun määrän kertoja:" );
    input.nextLine();
    for(int x = 1; x <=pituus; x++) {
    merkkijono = merkkijono + merkit; //String merkkijonot voidaan yhdistää "+" merkillä
    System.out.println(merkkijono);
    }
    }
    
    //Tehtävä 28 Merkillinen neliö. Tässä tehdään neliö
     void teeNeliö(int korkeus, int leveys){
    System.out.println("tulosta neliö (korkeus, leveys):" );
      
    // tarvitaan kaksi for luuppia. Ensimmäisellä tehdään rivi-merkkijono, 
    for(int x = 1; x <=leveys; x++){
    merkkijono = merkkijono + merkit;
    }
    //...ja toisella luupilla toistetaan merkkojoa allekkain  
    for(int y = 1; y <=korkeus; y++){
    System.out.println(merkkijono);
    }
    }
    
    //Tehtävä 29 Merkillinen kolmio. Tässä tehdään kolmio
    void teeKolmio(int korkeus){
    System.out.println("tulosta kolmio:" );
    for(int y=1; y<=korkeus; y++){   
    for(int x = 1; x <=korkeus; x++){
    merkkijono = merkkijono + merkit;
    System.out.println(merkkijono);
    }
    }
    } 
}
