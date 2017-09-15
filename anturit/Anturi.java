
package anturit;

public class Anturi {
    
    //HUOM! jos nämä eivät ole static, arvot eivät jää talteen kun tehdään uusi objekti. Molemmissa sekä Testi että Mittari luokissa
    //tehdään omat objektit. Ko. muuttujien arvot säilyy nyt kaikissa tästä luokasta tehdyistä objekteissa.
    //Kokeile ottaa static pois, ja aja ohjelma. Mitä tapahtuu ja miksi?
    static double LämpöMax;
    static double LämpöMin;
     
    public double getLämpötila(){
        
    double lämpötila = -1;
     
    while (lämpötila < LämpöMin || lämpötila > LämpöMax) {    
    // tähän satunnaismuuttuja, joka generoi lämpötilan
    // testaa lämpötilä if lausekkeella, että se on annetussa välissä
    lämpötila = Math.round(Math.random()*LämpöMax);
    // random antaa lukuja välillä [0,1]
    // nyt lämpötila saa lukuja välillä [0,LämpöMax]. ja näistä pitää valita luvut väliltä [LämpöMin,LämpöMax]
    }
    // nyt palautuu vain arvoja välillä [LämpöMin,LämpöMax]
    return lämpötila;
    }
    
    //tällä setMetodilla syötetään min ja max luvut 
    public void setLämpötila(double min, double max){
        this.LämpöMax = max;
        this.LämpöMin = min;
    }
}
