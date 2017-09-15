
package anturit;

import java.util.Scanner;

public class Testi {

static double mittaus;
static double valinta = 1;

    public static void main(String[] args) {
    
    Scanner lukija = new Scanner(System.in);
    System.out.println("Anna max lämpötila");
    double maxTemp = lukija.nextDouble();
    System.out.println("Anna min lämpötila");
    double minTemp = lukija.nextDouble();
    
    Anturi anturi = new Anturi(); // tehdään anturista objekti
    anturi.setLämpötila(minTemp, maxTemp); // rajat laitetaan konstruktorin kutsussa
    
    while (valinta == 1){
        System.out.println("Mittaa lämpötila: anna 1, Lopeta mittaaminen: annan 0");
        valinta = lukija.nextInt();    
        // vaihtoehto 1
        //mittaus = anturi.getLämpötila(); // anturi objetilla käynnistetään getLämpötila metodi
        // lisää joku toiminne, jolla aktivoit lämpötilan mittaamisen (esim. syötä jotakin, niin silloin lämpötilan mittaus käynnistyy)
        //System.out.println(mittaus +" °C");
        
        //vaihtoehto 2
        Mittari mittari = new Mittari();
        mittari.näytä();
        }
        System.out.println("Mittaus lopetettu");
    }
}
