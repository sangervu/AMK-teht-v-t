package pankkitili;

import java.util.Scanner;

public class TiliTesti {

    public static void main(String[] args) {
        int valinta = 1;
        Scanner lukija = new Scanner(System.in);
        PankkiTili tili = new PankkiTili();
        MaksuKortti kortti = new MaksuKortti();

        while (valinta != 0) {
            System.out.println("1 = Laita rahaa tilille, 2 = Nosta rahaa tililtä, 3 = Tulosta tilin saldo, 5 = Anna tilinumero kortille, 5 = Anna uusi PIN, 6 = Testaa kytkös, 0 = Lopetus");
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
                System.out.println("Anna tilinumero kortille");
                int tiliNumero = lukija.nextInt();
                tili.setTili(tiliNumero); //tilinimero siirretään setterillä MaksuKortille, jossa se annetaan tili-muuttujalle

            } else if (valinta == 5) {
                System.out.println("Syötä uusi PIN koodi");
                int pinEka = lukija.nextInt();
                kortti.setPinEka(pinEka);
                System.out.println("Syötä uusi PIN koodi uudestaan");
                int pinToka = lukija.nextInt();
                kortti.setPinToka(pinToka);

            } else if (valinta == 6) {
                System.out.println("Testataan kytkös. Anna pankkikorttisi numero");
                int pankkiKortti = lukija.nextInt();
                // luodaan uusi pankkokortti objekti vain minua varten
                MaksuKortti minunKortti = new MaksuKortti();
                minunKortti.setKortti(pankkiKortti); //Setteri, jolla annetaan pankkikortin numero minunKortti objektille

                // luodaan uusi pankkitili objekti vain minua varten
                System.out.println("Testataan kytkös. Anna tlinumerosi");
                int tiliNumero = lukija.nextInt();
                PankkiTili minunTili = new PankkiTili();
                minunTili.setTili(tiliNumero); //Setteri, jolla annetaan tilinumero minunKortti objektille

                minunTili.pano(1000); //pano 1000 egee

                System.out.println("Anna ostoksen summa");
                double ostos = lukija.nextDouble();
                minunTili.otto(ostos);

                double minunSaldo = minunTili.getSaldo();
                System.out.println("Saldosi jäjellä " + minunSaldo + " €");
                
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
