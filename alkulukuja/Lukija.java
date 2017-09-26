package alkulukuja;

import java.util.Scanner;

public class Lukija {

    public static void main(String[] args) {
        System.out.println("Anna suurin etsimäsi alkuluku");
        Scanner input = new Scanner(System.in);
        int lukuMäärä = input.nextInt();
        
        AlkuLukuja alku = new AlkuLukuja();
        alku.setSuurinAlkuluku(lukuMäärä);
        
        System.out.println("Alkulukujen lukumäärä = "+(int)alku.getAlLukumäärä());
        

        int[] alkuLukuja = alku.getAlkuluvut();
        for (int t : alkuLukuja) {
            System.out.println(t);
        }

    }

}
