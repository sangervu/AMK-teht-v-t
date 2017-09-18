package pankkitili;

import java.util.Scanner;

public class TiliTesti {

    public static void main(String[] args) {
        int valinta = 1;
        Scanner lukija = new Scanner(System.in);
        PankkiTili tili = new PankkiTili();
        MaksuKortti kortti = new MaksuKortti();

        while (valinta != 0) {
            System.out.println("1 = Laita rahaa tilille, 2 = Nosta rahaa tililtä, 3 = Tulosta tilin saldo, 4 = Anna uusi PIN, 0 = Lopetus");
            valinta = lukija.nextInt();

            if (valinta == 1) {
                System.out.println("Anna syötettävä määrä €");
                double panoEuro = lukija.nextInt();
                tili.pano(panoEuro);
            } else if (valinta == 2) {
                System.out.println("Anna nostettava määrä €");
                double nostoEuro = lukija.nextInt();
                tili.otto(nostoEuro);

            } else if (valinta == 3) {
                double saldo = tili.getSaldo();
                System.out.println("Anna saldo = " + saldo + " €");

            } else if (valinta == 4) {
                System.out.println("Syötä uusi PIN koodi");
                int pinEka = lukija.nextInt();
                kortti.setPinEka(pinEka);
                System.out.println("Syötä uusi PIN koodi uudestaan");
                int pinToka = lukija.nextInt();
                kortti.setPinToka(pinToka);

            } else if (valinta == 0) {
                System.out.println("Istunto lopetettu");

            } else {
                System.out.println("Tee uusi valinta");
            }
        }
    }

    public void pinOk(boolean test) {
        boolean pinTest = test;
        System.out.println("PIN koodi  " + pinTest);

    }
}
