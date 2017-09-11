package merkilliset;
import java.util.Scanner;

public class MerkillinenTesti {
    public static void main(String[] args) {
    
    Merkillinen merkillinen = new Merkillinen();
    Scanner input = new Scanner(System.in);

    //luetaan kuinka monta kertaa merkki tulostetaan
    System.out.println("lue kuinka monta kertaa merkki tulostetaan");
    int toistokerrat = input.nextInt();

    // luetaan yksi merkki
    System.out.println("lue yksi merkki");
    String merkki = input.next();
    input.nextLine();
    
    
    merkillinen.setString(merkki);
    merkillinen.teeRivi(toistokerrat);
        
    }
    
    }