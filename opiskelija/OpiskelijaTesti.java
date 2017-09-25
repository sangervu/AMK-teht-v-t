package opiskelija;

import java.util.Scanner;

public class OpiskelijaTesti {

    public static void main(String[] args) {

        String opiskelija;
        String opr = "T14";
        Opiskelija yop = new Opiskelija("123456", "Silja", "Angervuori");

        Scanner input = new Scanner(System.in);

        Opiskelijaryhmä opRyhmä = new Opiskelijaryhmä(opr, yop);

        Opiskelija opi = new Opiskelija();
        opiskelija = opi.getOpiskelijanTiedot();
        System.out.println(opiskelija);

        Opiskelija opi1 = new Opiskelija("000001", "Eero", "Esimerkki");
        Opiskelija opi2 = new Opiskelija("000002", "Elli", "Esimerkki");
        Opiskelija opi3 = new Opiskelija("000003", "Esko", "Esimerkki");

        opiskelija = opi1.getOpiskelijanTiedot();
        System.out.println(opiskelija);
        opiskelija = opi2.getOpiskelijanTiedot();
        System.out.println(opiskelija);
        opiskelija = opi3.getOpiskelijanTiedot();
        System.out.println(opiskelija);

        Opiskelijaryhmä opRyhmä2 = new Opiskelijaryhmä("T15", opi3);
        opr = opRyhmä2.getORT();
        System.out.println(opr);
        System.out.println(opRyhmä.opRyhmäTaulukko);

        Opiskelijaryhmä opRyhmä3 = new Opiskelijaryhmä("T16", opi2);

        /*System.out.println("Anna opiskelijan etunimi");
     String etunimi = input.nextLine();
     opi.setEtuNimi(etunimi);
     System.out.println("Anna opiskelijan sukunimi");
     String sukunimi = input.nextLine();
     opi.setSukuNimi(sukunimi);
     System.out.println("Anna opiskelijanumero");
     String opiskelijanumero = input.nextLine();
     opi.setOpiskelijaNumero(opiskelijanumero);
     
     String opiskelija = opi.getOpiskelijanTiedot();
     System.out.println(opiskelija);
         */
    }

}

