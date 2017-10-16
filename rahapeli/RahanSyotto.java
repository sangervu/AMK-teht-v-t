/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;
import java.util.Scanner;
/**
 *
 * @author Arttu
 */
public class RahanSyotto {

    static Scanner lukija = new Scanner(System.in);
    int raha;
    Saldo syottoSaldo = new Saldo();
    //Saldo voittoSaldo = new Saldo(raha);
    //PanosSyotto uusiPanos = new PanosSyotto();

    public void ekaSyotto() {

        do {
            System.out.println("Syötä pelirahaa (väh. 1, enint. 200)");
            raha = lukija.nextInt();
            if (raha > 0 && raha < 200) {
                syottoSaldo.lisaaSyottosaldo(raha);
                break;
            } else {
                System.out.println("Rahaa ei syötetty tarpeeksi tai liikaa.");
            }
        } while (raha < 1 || raha > 200);

        System.out.println("Syötit " + raha + " rahaa");
    }
}

