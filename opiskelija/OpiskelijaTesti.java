package opiskelija;

import java.util.Scanner;

public class OpiskelijaTesti {

    public static void main(String[] args) {

        String opiskelija;

        Scanner input = new Scanner(System.in);
        Opiskelija opi = new Opiskelija();

        Opiskelija opi1 = new Opiskelija("000001", "Eero", "Esimerkki");
        Opiskelija opi2 = new Opiskelija("000002", "Elli", "Esimerkki");
        Opiskelija opi3 = new Opiskelija("000003", "Esko", "Esimerkki");

        opiskelija = opi1.getOpiskelijanTiedot();
        System.out.println(opiskelija);
        opiskelija = opi2.getOpiskelijanTiedot();
        System.out.println(opiskelija);
        opiskelija = opi3.getOpiskelijanTiedot();
        System.out.println(opiskelija);

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

