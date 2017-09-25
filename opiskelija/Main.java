
package opiskelija;

import java.util.Scanner;


public class Main {
    
  

  
    public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
     Opiskelija opi = new Opiskelija();
    
     System.out.println("Anna opiskelijan etunimi");
     String etunimi = input.nextLine();
     opi.setEtuNimi(etunimi);
     System.out.println("Anna opiskelijan sukunimi");
     String sukunimi = input.nextLine();
     opi.setSukuNimi(sukunimi);
     System.out.println("Anna opiskelijanumero");
     String opiskelijanumero = input.nextLine();
     opi.setOpiskelijaNumero(opiskelijanumero);
     
     String opiskelija = opi.getOpiskelijanTiedot();
     System.out.println(opiskelija);
     
    }
    
}
