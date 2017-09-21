package lentohorisontti;

import java.util.Scanner;

public class LentoHorisontti {

    public static final double radiusEarth = 6371000.0; // maapallon säde [m]

    public static void main(String[] args) {

        double lentoKorkeus; //varataan lentokorkeudelle parametri metreinä
        double lentoNopeusKh; //varataan lentonopeudelle parametri kilometriä tunnissa
        double lentoNopeusMs; //varataan lentonopeudelle parametri metriä sekunnissa
        double alfaRad; // varataan parametri kulmalle maapallom keskipisteessä radiaaneina
        double aika; // varataan parametri ajalle, jonka lentokoen on näkyvissä
        double lentokoneenKulkemaIlmaMatkaM; //varataan parametri lentokoneen kulkemalle ilmamatkalle [m]
        double lentokoneenKulkemaMaaMatkaM; //varataan parametri lentokoneen kulkemalle maamatkalle [m]
        double lentokoneenKulkemaMaaMatkaKm; //varataan parametri lentokoneen kulkemalle maamatkalle [Km]

        String h;
        String min;
        String sec;

        Scanner input = new Scanner(System.in);
        System.out.println("Anna lentokoneen lentokorkeus [m]");
        lentoKorkeus = input.nextDouble();

        System.out.println("Anna lentokoneen maanopeus [km/h]");
        lentoNopeusKh = input.nextDouble();
        lentoNopeusMs = lentoNopeusKh * 1000. / 3600.; //sama kuin yllä, mutta [m/s]

        alfaRad = Math.acos(radiusEarth / (radiusEarth + lentoKorkeus));

        //nämä on vain testaus varten
        //System.out.println("alfaRad = " + alfaRad);
        //System.out.println("lentokoneen maanopeus [m/s] = " + lentoNopeusMs);
        //*/
        lentokoneenKulkemaIlmaMatkaM = alfaRad * (radiusEarth + lentoKorkeus); // metreissä
        lentokoneenKulkemaMaaMatkaM = alfaRad * (radiusEarth); // metreissä
        lentokoneenKulkemaMaaMatkaKm = Math.round(lentokoneenKulkemaMaaMatkaM / 1000.);

        aika = lentokoneenKulkemaIlmaMatkaM / lentoNopeusMs;
        System.out.println("Aika, jonka lentokone näkyy ennen kuin häviää horisonttiin = " + Math.round(aika) + " sekuntia");//kökkö tapa esittää aika!

        //parempi tapa esittää aika
        TimeFormat time = new TimeFormat();
        time.setTime(aika);

        System.out.println(time.toUniversalString());

        System.out.println("Matka, jonka lentokone etenee maahan nähden ennen kuin häviää horisontin taakse = "
                + lentokoneenKulkemaMaaMatkaKm + " km");
    }
}
