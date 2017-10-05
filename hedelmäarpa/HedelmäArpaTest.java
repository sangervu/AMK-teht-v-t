package hedelmäarpa;

import java.util.Scanner;

public class HedelmäArpaTest {

    public static void main(String[] args) {
        String arpa;
        int arvonnat = 0;
        int intArpa;
        int valinta = 1;
        Scanner input = new Scanner(System.in);
        // while loop pitää loopissa halutun  määrän kertoja
        while (valinta == 1) {
            System.out.println("Anna valina: 1 = jatka");
            valinta = input.nextInt();
            HedelmäArpa.hedelmaArpa();
            
            arvonnat = arvonnat + 1;
            System.out.println("Arvontojen lukumäärä = " +arvonnat );
            
            arpa = HedelmäArpa.arpa;
            intArpa = HedelmäArpa.intArpa;
            
            System.out.println("hedelmä: "+arpa+"; "+"luku: "+ intArpa);
                    
        }

    }

}
