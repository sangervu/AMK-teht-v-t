package pankkitili;

public class MaksuKortti {

    private int maksuKorttiNumero;
    private double tili; //tälle luetaan tilinumero, johon tämä maksukortti liittyy
    private int PIN;
    private int ekaPin;
    private int tokaPin;

    // tehdään TiliTesti-luokasta objekti, jotta pinTest tulos (true/false) voidaan siirtää pinOk metodille, josta se tulostetaan ruudulle
    TiliTesti testi = new TiliTesti();

   //luetaan ensimmäinen PIN syöte
    public void setPinEka(int pin) {
        if (pin >= 0 && pin <= 9999) {
            ekaPin = pin;
        } else {
            System.out.println("Anna PIN uudestaan");
        }
    }

    //luetaan toinen PIN syöte
    public void setPinToka(int pin) {
        if (pin >= 0 && pin <= 9999) {
            tokaPin = pin;
        } else {
            System.out.println("Anna PIN uudestaan");
        }
        //testataan onko PIN syöteet samat. Viedään joko true tai falce tiedot TiliTest;iin
        if (ekaPin == tokaPin) {
            PIN = tokaPin;
            testi.pinOk(true);
        } else {
            testi.pinOk(false);
        }
    }
    
      //tehdän setteri, jolla annetaan instanssimuuttujalle "int maksuKorttiNumero", joka syötetään TiliTesti luokasta
    public void setKortti(int korttiTieto){ 
        maksuKorttiNumero = korttiTieto;
    }
   
    
    
}
 
