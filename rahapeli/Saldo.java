/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahapeli;

/**
 *
 * @author Arttu
 */
public class Saldo {

    private int syottoSaldo = 0;
    private int voittoSaldo = 0;
    private int raha;
    private int panos;
    private int kokonaisSaldo;

    public Saldo() {
    }

    public int getSyottoSaldo() {
        return syottoSaldo;
    }

    public void setSyottoSaldo(int syottoSaldo) {
        this.syottoSaldo = syottoSaldo;
    }

    public int getVoittoSaldo() {
        return voittoSaldo;
    }

    public void setVoittoSaldo(int voittoSaldo) {
        this.voittoSaldo = voittoSaldo;
    }

    public int getRaha() {
        return raha;
    }

    public void setRaha(int raha) {
        this.raha = raha;
    }
    //getterit ja setterit loppuu

    //peliSaldo
    public void lisaaSyottosaldo(int raha) {
        syottoSaldo = syottoSaldo + raha;
    }

    public void lisaaVoittosaldo(int raha) {
        this.voittoSaldo = voittoSaldo + raha;
    }

    public void vahennaVoittosaldo(int määrä) {
        this.voittoSaldo = this.voittoSaldo - määrä;
    }

    public int kokoSaldo() {
        kokonaisSaldo = this.syottoSaldo + this.voittoSaldo;
        return kokonaisSaldo;
    }

    public boolean voikoVahentaa(int määrä) {
        if (määrä <= syottoSaldo + voittoSaldo) {
            return true;
        } else {
            return false;
        }
    }

    public void vahennaSaldoa(int määrä) {
        if (määrä <= syottoSaldo) {
            syottoSaldo -= määrä;

        } else if (määrä <= syottoSaldo + voittoSaldo) {
            määrä -= syottoSaldo;
            syottoSaldo = 0;
            voittoSaldo -= määrä;
        }

    }
}

