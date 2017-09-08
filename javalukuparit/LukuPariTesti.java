/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalukupari_16;
import java.util.Scanner;

/**
 *
 * @author sakar
 */
public class LukuPariTesti {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("lue 1.kokonaisluku");
    int luku1 = input.nextInt();
    input.nextLine();
    System.out.println("lue 2.kokonaisluku");
    int luku2 = input.nextInt();
    
    LukuPari pari1 = new LukuPari();
    pari1.setLuku1(luku1);
    pari1.setLuku2(luku2);
    
    LukuPari pari2 = new LukuPari(3,9);
    
    System.out.println("luku 1 on " +pari1.luku1);
    System.out.println("luku 2 on " +pari1.luku2);
    
    System.out.println(pari1.toString());
    System.out.println(pari1);
    
    }
    
}
