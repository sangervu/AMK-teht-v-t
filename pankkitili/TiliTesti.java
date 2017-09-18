package pankkitili;

import java.util.Scanner;

public class TiliTesti {
    
    public static void main(String[] args) {
    int valinta = 1;  
    Scanner lukija = new Scanner(System.in);
    PankkiTili tili = new PankkiTili();
    
    while (valinta != 0){
    System.out.println("1 = Laita rahaa tilille, 2 = Nosta rahaa tililtä, 3 = Tulosta tilin saldo, 0 = Lopetus");
    valinta = lukija.nextInt();
    
    if (valinta== 1){
        System.out.println("Anna syötettävä määrä €"); 
        int panoEuro = lukija.nextInt();
        tili.pano(panoEuro);
        }
        else if (valinta==2){
    
        }
        else if (valinta==3){
        double saldo = tili.getSaldo();
        System.out.println("Anna saldo = "+saldo+" €" );
        
        }
        else if (valinta==0) {
        System.out.println("Istunto lopetettu");
    
        }
        else
        System.out.println("Tee uusi valinta");
    }
}
}
