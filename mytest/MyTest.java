package mytest;

import java.util.Scanner;

public class MyTest {

    public static void main(String[] args) {
        String abc;
        int lukumäärä;
        double glukoosi;

        Scanner lukija = new Scanner(System.in);
        Test testi = new Test();

        System.out.println("Syötä glukoosi mmol/l ");
        glukoosi = lukija.nextDouble();

        System.out.println("Syötä saateteksti");
        abc = lukija.next();

        System.out.println("Syötä lukumäärä");
        lukumäärä = lukija.nextInt();

        testi.setGlukoosi(glukoosi, abc, lukumäärä);

        System.out.println("glukoosi = " + testi.getGlukoosi() + " mmol/l");
        System.out.println("saateteksti: " + testi.getAbc());
        System.out.println("lukumäärä: " + testi.getLukumäärä());

    }

}
