
package anturit;

public class Testi {

double lämpötila;

    public static void main(String[] args) {
    
    Anturi anturi = new Anturi(); // tehdään anturista objekti
    lämpötila = anturi.getLämpötila();
    
    // lisää joku toiminne, jolla aktivoit lämpötilan mittaamisen (esim. syötä jotakin, niin silloin lämpötilan mittaus käynnistyy)
    System.out.println(lämpötila);
    }
    
}
