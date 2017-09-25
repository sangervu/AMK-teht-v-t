package opiskelija;

public class Opiskelija {

    private String opiskelijaNumero;
    private String etuNimi;
    private String sukuNimi;

    public void setOpiskelijaNumero(String numero) {

        this.opiskelijaNumero = numero;
    }

    public void setEtuNimi(String nimi) {

        this.etuNimi = nimi;
    }

    public void setSukuNimi(String sukuNimi) {
        this.sukuNimi = sukuNimi;
    }

    public String getOpiskelijanTiedot(){
    
    return (opiskelijaNumero+" " + etuNimi+" " + sukuNimi);
    }
    
}
