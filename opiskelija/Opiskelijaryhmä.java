package opiskelija;

import java.util.Arrays;

public class Opiskelijaryhmä {

    int uusiKoko = 0;

    Opiskelija[] opRyhmäTaulukko = new Opiskelija[0];
    private String opiskelijaRyhmäTunnus;
    Opiskelija opi;

    Opiskelijaryhmä() {
    }

    Opiskelijaryhmä(String a, Opiskelija opi) {
        this.opiskelijaRyhmäTunnus = a;
        this.opi = new Opiskelija();
    }

    public String getORT() {
        return opiskelijaRyhmäTunnus;
    }

    public void setORT(String b) {
        this.opiskelijaRyhmäTunnus = b;
    }

    public void lisää(Opiskelija opiObjekti) {

        uusiKoko = uusiKoko + 1;
        Arrays.copyOf(opRyhmäTaulukko, uusiKoko);
        opRyhmäTaulukko[uusiKoko] = opiObjekti;

    }

}
