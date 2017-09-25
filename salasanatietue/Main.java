
package salasanatietue;

public class Main {
    
      public static void main(String[] args) {
          
          Salasanatietue sala = new Salasanatietue("abcdefg");
          
          String salasana = sala.getSalasana();
          double aikaleima = sala.aikaleima;
          System.out.println(salasana + aikaleima);
    }
    
}
