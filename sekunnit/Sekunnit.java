package sekunnit;

import java.util.Scanner;

public class Sekunnit {

    public static void main(String[] args) {
        int sekunteja;

        Scanner input = new Scanner(System.in);
        System.out.println("Anna tunnit");
        int h = input.nextInt();
        System.out.println("Anna minuutit");
        int m = input.nextInt();
        System.out.println("Anna sekunnit");
        int s = input.nextInt();

        sekunteja = sekunteina(h, m, s);
        System.out.println("Tulosta sekunteina: " + sekunteja +" sekuntia");

    }

    public static int sekunteina(int tunnit, int minuutit, int sekunnit) {

        return (tunnit * 60 * 60 + minuutit * 60 + sekunnit);

    }

}
