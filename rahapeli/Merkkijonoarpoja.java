/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;
import java.util.Random;
/**
 *
 * @author Arttu
 */
public class Merkkijonoarpoja {

    static String arpa;
    static int intArpa;
    public static Random rnd = new Random();//hyödynnetään valmista luokkaa java.util.Random ja tehdään sille objekti


   
        
       public static char merkki () {
           char arpa;
           int arvontaluku = 1 + rnd.nextInt(100);
           
           if (arvontaluku == 100){
               arpa = 'B';
           }else if (arvontaluku >=94 && arvontaluku <= 99){
               arpa = '£';
           }else if (arvontaluku >=84 && arvontaluku <= 93){
               arpa = '€';
            }else if (arvontaluku >=74 && arvontaluku <= 83){
               arpa = '$';   
           }else if (arvontaluku >=59 && arvontaluku <= 73){
               arpa = '@';
           }else {
               arpa = '%';
           
           }
           return arpa;
       }

public static String merkkijono () {
    
    String merkkijono = "";
    for (int i = 1; i <= 3; i++){
        merkkijono += merkki();
    }

    return merkkijono;

    
}
}
      
    
