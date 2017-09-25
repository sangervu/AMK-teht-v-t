package salasanatietue;

import java.util.Date;

public class Salasanatietue {

    String salasana;
    Date date;
    double aikaleima;

    Salasanatietue(String salasana) {
        Date date = new Date();
        this.aikaleima = date.getTime();
        this.salasana = salasana;
    }

    public String getSalasana() {
        return salasana;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

}
