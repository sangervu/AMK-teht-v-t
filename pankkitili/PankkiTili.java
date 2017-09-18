package pankkitili;

public class PankkiTili {

    private double saldo = 0;
    double nosto;
    double pano;

    double getSaldo() {
        return saldo;
    }

    public void otto(double nosto) {

        if (saldo >= nosto) {
            saldo = saldo - nosto;
        } else {

            System.out.println("Tilillä ei katetta");

        }
    }

    public void pano(double määrä) {

        if (määrä > 0) {
            saldo = saldo + määrä;
        } else {
            System.out.println("Luku ei voi olla negatiivinen");
        }
    }

}
