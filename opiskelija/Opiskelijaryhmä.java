package opiskelija;

public class Opiskelijaryhmä {
    
    String [] opiskelija = new String[0];

    private String opiskelijaRyhmäTunnus;

    Opiskelijaryhmä(String a, String b) {
        this.opiskelijaRyhmäTunnus = a;
    }

    public String getORT() {
        return opiskelijaRyhmäTunnus;
    }

    public void setORT(String b) {
        this.opiskelijaRyhmäTunnus = b;
    }

}
