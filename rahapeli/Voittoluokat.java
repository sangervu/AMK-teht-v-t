/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Arttu
 */
public class Voittoluokat {
    
    private String pelitulos;
    private int voitonArvo;
    
    
     private static Map<String, Integer> voittoluokat = new HashMap(); //jostain syystä int täytyy olla tässä Integer
      
      public Voittoluokat(){
         voittoluokat.put("%%%", 1);
         voittoluokat.put ("@@@", 2);
         voittoluokat.put("$$$", 5);
         voittoluokat.put("€€€", 10);
         voittoluokat.put("£££", 20);
         voittoluokat.put("BBB",100);
      }
    
    
    
    
    public int tutkiVoitto(String pelitulos) {

        if (voittoluokat.containsKey(pelitulos)) {
            return voittoluokat.get(pelitulos);
        } else {
            return 0;
        }

    }
    
}
