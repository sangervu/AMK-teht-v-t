package kuukausitaulukko;

import java.util.Scanner;

public class KuukausiTaulukko {

    public static void main(String[] args) {

        int kkNumero = 0;
        Scanner input = new Scanner(System.in);
        String[] myMonths = new String[13];

        myMonths[1] = "Tammikuu";
        myMonths[2] = "Helmikuu";
        myMonths[3] = "Maaliskuu";
        myMonths[4] = "Huhtikuu";
        myMonths[5] = "Toukokuu";
        myMonths[6] = "Kesäkuu";
        myMonths[7] = "Heinäkuu";
        myMonths[8] = "Elokuu";
        myMonths[9] = "Syyskuu";
        myMonths[10] = "Lokakuu";
        myMonths[11] = "Marraskuu";
        myMonths[12] = "Joulukuu";

        while (kkNumero >= 0 && kkNumero <= 12) {
            System.out.println("Anna kuukauden numero");
            kkNumero = input.nextInt();
            if (kkNumero >= 0 && kkNumero <= 12) {
                System.out.println(myMonths[kkNumero]);
            }
            else{
            }
        }
    }
}
