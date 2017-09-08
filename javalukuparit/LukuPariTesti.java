package javalukuparit;
import java.util.Scanner;
public class LukuPariTesti {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // luetaan kaski kokonaislukua: luku1 ja luku2
    Scanner input = new Scanner(System.in);
    System.out.println("lue 1.kokonaisluku");
    int luku1 = input.nextInt();
    input.nextLine();
    System.out.println("lue 2.kokonaisluku");
    int luku2 = input.nextInt();
   
    //luvut annetaan ja syötetään LukuPari attribuuteiksi suoraan LukuPari oliota luotaessa. Luvut ovat
    //konstruktorin parametreina
    LukuPari pari1 = new LukuPari(luku1,luku2);
    
    //TAI tämä on toinen vaihtoehto
    //************************************************************************************
      // pari1 on LukuPari-olion instanssimuuttuja
    // luku1 ja luku2 viedään viedään LukuPari:n objektille instanssimuutujiin
    
    //LukuPari pari1 = new LukuPari();
    //pari1.setLuku1(luku1);
    //pari1.setLuku2(luku2);
    //***********************************************************************************'
    
    //luvut 1 ja 2 haetaan getLuku metodilla, johon päästään luodun pari1 objektin kautta
    System.out.println("luku 1 on " +pari1.getLuku1());
    System.out.println("luku 2 on " +pari1.getLuku2());
    
    System.out.println(pari1.getString());
    
    }
}
