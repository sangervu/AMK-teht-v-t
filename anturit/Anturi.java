
package anturit;

public class Anturi {
    
   static double lämpötila = 0; // alustetaan lämpötila niin, että while loop lähtee käyntiin
     
    public double getLämpötila(){
     
    while (lämpötila < 10. || lämpötila > 30.) {    
    // tähän satunnaismuuttuja, joka generoi lämpötilan
    // testaa lämpötilä if lausekkeella, että se on annetussa välissä
    lämpötila = Math.round(Math.random()*50);
    // random antaa lukuja välillä [0,1]
    // nyt lämpötila saa lukuja välillä [0,50]. ja näistä pitää valita luvut väliltä [10.0,30.0]
    }
    
    // nyt palautuu vain arvoja välillä [10.0,30.0]
    return lämpötila;
    
    }
}
