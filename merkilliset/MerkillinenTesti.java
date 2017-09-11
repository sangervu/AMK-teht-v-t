package merkilliset;
import java.util.Scanner;

public class MerkillinenTesti {
    int valinta;
    public static void main(String[] args) {
    
    Merkillinen merkillinen = new Merkillinen();
    Scanner input = new Scanner(System.in);
     
     // luetaan yksi merkki
        System.out.println("lue yksi merkki");
        String merkki = input.next();
        merkillinen.setString(merkki);
        input.nextLine();

        //1 = rivi, 2 = neliö, 3 = kolmio, muu = poistu
        System.out.println("1 = rivi, 2 = neliö, 3 = kolmio, muu numero = poistu");
        int valinta = input.nextInt();
        input.nextLine();
      
    switch(valinta) {
        
        case 1://1. ensimmäinen valinta tekee tämän
            
        System.out.println("lue kuinka monta kertaa merkki tulostetaan");
        int toistokerrat = input.nextInt();
        merkillinen.teeRivi(toistokerrat);
        break;
        
        case 2://2. toinen valinta tekee tämän
        
        System.out.println("Tee neliö: lue korkeus");
        int korkeus = input.nextInt();
        input.nextLine();
        System.out.println("Tee neliö: lue leveys");
        int leveys = input.nextInt();
        merkillinen.teeNeliö(korkeus, leveys);  
        break;
        
        case 3: //3. valinta tekee tämän, muut valinnat lopettaa 
        System.out.println("Tee kolmio: lue korkeus");
        int korkeusKolmio = input.nextInt();
        input.nextLine();
        merkillinen.teeKolmio(korkeusKolmio); 
    }
    
    }
    
    }