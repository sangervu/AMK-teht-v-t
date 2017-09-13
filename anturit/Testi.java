
package anturit;

import java.util.Scanner;

public class Testi {

static double lämpötila;
static double valinta = 1;

    public static void main(String[] args) {
    
    Scanner lukija = new Scanner(System.in);
    
    while (valinta == 1){
        System.out.println("Mittaa lämpötila: anna 1, Lopeta mittaaminen: annan 0");
        valinta = lukija.nextInt();    
        Anturi anturi = new Anturi(); // tehdään anturista objekti
        lämpötila = anturi.getLämpötila(); // anturi objetilla käynnistetään getLämpötila metodi
        // lisää joku toiminne, jolla aktivoit lämpötilan mittaamisen (esim. syötä jotakin, niin silloin lämpötilan mittaus käynnistyy)
        System.out.println(lämpötila +" C");
        }
        System.out.println("Mittaus lopetettu");
    }
}
