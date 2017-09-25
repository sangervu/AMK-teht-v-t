package opiskelija;

public class Opiskelija {

    private String opiskelijaNumero;
    private String etuNimi;
    private String sukuNimi;


     Opiskelija() {

        this("000000", "Ei etunimä", "Ei sukunimeä");
    }

    Opiskelija(String a, String b, String c) {

        this.opiskelijaNumero = a;
        this.etuNimi = b;
        this.sukuNimi = c;

    }

    public void setOpiskelijaNumero(String numero) {

        this.opiskelijaNumero = numero;
    }

    public void setEtuNimi(String nimi) {

        this.etuNimi = nimi;
    }

    public void setSukuNimi(String sukuNimi) {
        this.sukuNimi = sukuNimi;
    }

    public String getOpiskelijanTiedot() {

        return (opiskelijaNumero + " " + etuNimi + " " + sukuNimi);
    }

}
