package javalukuparit;
public class LukuPari {
    
//nämä ovet luokan attribuutit    
int luku1;
int luku2;
String merkkijono;
 
//tämä on konstrukori, eli tämä alustaa LukuPari objektin luvilla a ja , joka käynnistetään LukuPariTest luokasta
LukuPari(int a, int b) {
    this.setLuku1(a);
    this.setLuku2(b);
 }

//nämä metodit alustavat attribuutin niihin syötetyillä arvoilla
 // Setter
  public void setLuku1(int c) {
    this.luku1 = c;
  }
  // Setter
  public void setLuku2(int c) {
    this.luku2 = c;
  }
  
  //näillä metodeilla luetaan attribuutien arvot
   // Getter
  public int getLuku1() {
    return luku1;
  }
  
  // Getter
  public int getLuku2() {
    return luku2;
  }
  
  //Tämä metodi vain laittaa merkkijonot peräkanaa
  public String getString (){
      merkkijono = "luku 1 on " + Integer.toString(luku1) + " ," + "luku 2 on " + Integer.toString(luku2);
      return merkkijono;
  } 
    
}
