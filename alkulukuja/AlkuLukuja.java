package alkulukuja;
import java.util.Arrays;

public class AlkuLukuja {

    private int[] alkuLukuja;
    private int suurinAlkuluku;
    private int alLukuMäärä;

    public void setSuurinAlkuluku(int n) {

        this.suurinAlkuluku = n; //alkulukujen lukumäärä kun n=1000

        alkuLukuja = new int[suurinAlkuluku];

        int i = 0; //tällä käynnistetään alkulukejn etsintä
        int k = -1;

        //mennään koko taulukko läpi
        for (i = 1; i < suurinAlkuluku; i++) {

            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                //System.out.print(i + " ");
                k = k + 1;
                this.alkuLukuja[k] = i;
            }
        }
        
        this.alLukuMäärä = k;
        this.alkuLukuja = Arrays.copyOf(alkuLukuja, k+1);

    }

    public double getAlLukumäärä() {

        return alLukuMäärä;
    }

    public int[] getAlkuluvut() {

        return alkuLukuja;
    }

}
