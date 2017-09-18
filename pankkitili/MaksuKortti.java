
package pankkitili;

public class MaksuKortti {
    
private int PIN;

  public void setPin(int pin) {
  if(pin>=0 && pin<=9999){    
  PIN = pin;
  }
  else{ 
  System.out.println("Väärä PIN");    
  }
  }
}
