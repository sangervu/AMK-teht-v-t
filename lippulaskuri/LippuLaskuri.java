package lippulaskuri;
import java.util.Scanner;

public class LippuLaskuri {

      final static int LapsiHinta = 12;
      final static int AikuisHinta = 24;
      //tähän parametriin lasketaan kokonaishinta
      static int lippuTulot = 0;

      //alustetaan henkilöiden lukumäärä nollaksi
      static int mies = 0;
      static int nainen = 0;
      static int lapsi = 0;
      static int valinta = 1;

      public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //pyöritetään niin kauan, kunnes luku on valinnan ulkopuolella
        while (valinta > -1 && valinta <4){

        System.out.println("LIPUNMYYNTI: 1 = mies, 2 = nainen, 3=lapsi, 0 = lipunmyynti loppuu");
        int valinta = lukija.nextInt();

        switch(valinta){
            case 0:// lopetetaan lipunmyynti ja tulostetaan
            System.out.println("Miesten lukumäärä = " + mies);
            System.out.println("Naisten lukumäärä = " + nainen);
            System.out.println("Lasten lukumäärä = " + lapsi);
            System.out.println("Lipputulot = " + lippuTulot);
            break;

            case 1:// mies ostaa lipun
            lippuTulot = lippuTulot + AikuisHinta;
            mies = mies + 1;
            break;

            case 2:// nainen ostaa lipun
            lippuTulot = lippuTulot + AikuisHinta;
            nainen = nainen + 1;
            break;

            case 3:// lapsi ostaa lipun
            lippuTulot = lippuTulot + LapsiHinta;
            lapsi = lapsi + 1;
            break;

            default:
            System.out.println("Virhe syötteessä!");
        }
    }
}
}