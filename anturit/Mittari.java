
package anturit;

public class Mittari {

public void näytä(){    
Anturi mittaa = new Anturi();
double mittaus = mittaa.getLämpötila();
System.out.println("Lämpötila = " + mittaus + " °C");
}
}
