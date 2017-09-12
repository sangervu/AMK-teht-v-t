package bmi;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Syötä pituus");
        double pituus = input.nextInt();
        pituus = annaPituus(pituus);
        System.out.println("Pituus (cm): " + pituus);
        
        System.out.println("Syötä paino)(kg)");
        double paino = input.nextInt();
        System.out.println("Paino: " + annaPaino(paino) );
        
        double bmi = laskeIndeksi(pituus, paino);
        
        //System.out.println(bmi);
        
       
    if (bmi < 18.5) {
            System.out.println("Normaalia alhaisempi paino:"+Math.round(bmi));
            }  
    else if (bmi > 18.5 && bmi < 25){
            System.out.println("Normaali paino:"+Math.round(bmi));
            }
    else if (bmi >= 25 && bmi <= 30){
            System.out.println("Lievä lihavuus:"+Math.round(bmi));
            }
    else if (bmi > 30 && bmi < 35){
            System.out.println("Merkittävä lihavuus:"+Math.round(bmi));
            }
    else if (bmi >= 35 && bmi < 40){
            System.out.println("Vaikea lihavuus:"+Math.round(bmi));
            }
    else if (bmi >= 40){
            System.out.println("Sairaalloinen lihavuus:"+Math.round(bmi));
            }
    }
    
   public static double annaPituus(double pituus) {
        
        return (pituus / 100);
       
    }
   public static double annaPaino(double paino) {
       
        return paino;
    }
    
    public static double laskeIndeksi (double pituus,double paino) {
        
        return paino/(pituus*pituus);
    }
}
    
