package keskiarvo;
import java.util.Scanner;

public class KeskiArvo {

     static double lukuPosSum = 0;
     static double lukuNegSum = 0;
     static int laskuriPos;
     static int laskuriNeg;
     static double luku=1;

     public static void main(String[] args) {
     // luetaan lukuja, positiivisia tai negatiivisia
     Scanner input = new Scanner(System.in);

     while (luku != 0){
     System.out.println("lue luku pos tai neg");
     luku = input.nextDouble();

     //tähän metodit
     if (luku >0) {
         laskuriPos = laskuriPos + 1;
         lukuPosSum = lukuPosSum + luku;
     }
     else if (luku <0) {
         laskuriNeg = laskuriNeg + 1;
         lukuNegSum = lukuNegSum + luku;
         input.nextLine();
         }
     }
     System.out.println("positiivisten lukujen lukumäärä= " +laskuriPos);
     System.out.println("summa= " +lukuPosSum);
     System.out.println("keskiarvo= " +lukuPosSum/laskuriPos);

     System.out.println("negatiivisten lukujen lukumäärä= " +laskuriNeg);
     System.out.println("summa= " +lukuNegSum);
     System.out.println("keskiarvo= " +lukuNegSum/laskuriNeg); } }

