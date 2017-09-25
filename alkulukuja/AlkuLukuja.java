package alkulukuja;

public class AlkuLukuja {

    public static int[] alkuLukuja;
    private int alkuLukujenLukumäärä = 1;

    public void setLukumäärä(int n) {

        this.alkuLukujenLukumäärä = n;

        alkuLukuja = new int[alkuLukujenLukumäärä];
        int arrayLaskuri = 0; //tämä on taulukkolaskuri
        int i = 0; //tällä käynnistetään alkulukejn etsintä

        //mennään koko taulukko läpi
        int max = alkuLukujenLukumäärä;
        for (arrayLaskuri = 0; arrayLaskuri <= alkuLukujenLukumäärä; arrayLaskuri++) {

            for (i = 1; i < max-10; i++) {

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
                    System.out.print(i + " ");
                    //alkuLukuja[arrayLaskuri] = i;
                }
            }
        }
        
        /*for (int t: alkuLukuja) {
        System.out.println(arrayLaskuri); 
}*/

    }

    public int[] getAlkuluvut() {

        return alkuLukuja;
    }

}
