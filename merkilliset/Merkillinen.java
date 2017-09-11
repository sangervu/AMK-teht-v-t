package merkilliset;

import java.util.Scanner;

public class Merkillinen {

    static String merkit = "*";
    static String merkkijono="";
    public void setString(String a){
        this.merkit=a;
    }
    
    void teeRivi(int pituus){
    Scanner input = new Scanner(System.in);
    System.out.println("tulosta valittu merkki valitun määrän kertoja:" );
    input.nextLine();
    
    for(int x = 1; x <=pituus; x++)
    merkkijono = merkkijono + merkit;
    System.out.println(merkkijono);
    
    }
}
