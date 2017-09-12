package arvosana;
import java.util.Scanner;

public class ArvoSana {

    static String ArvoSana;
    static int arvosana = 1;

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(arvosana>=0){

        System.out.println("Anna arvosanasi (0, 1, 2, 3, 4 tai 5):");
        arvosana = lukija.nextInt();

        ArvoSana = getArvoSana(arvosana);
        System.out.println(ArvoSana);
        }
        System.out.println("Toisto päättynyt");
    }

    static String getArvoSana(int arvosana){
        switch (arvosana) {
            case 0:
                ArvoSana = "Arvosanasi on hylätty.";
                break;
            case 1:
                ArvoSana = "Arvosanasi on tyydyttävä.";
                break;
            case 2:
                ArvoSana = "Arvosanasi on erittäin tyydyttävä.";
                break;
            case 3:
                ArvoSana = "Arvosanasi on hyvä.";
                break;
            case 4:
                ArvoSana = "Arvosanasi on erittäin hyvä.";
                break;
            case 5:
                ArvoSana = "Arvosanasi on kiitettävä.";
                break;
            default:
                ArvoSana = "Error";
        }
        return ArvoSana;
    }
}
