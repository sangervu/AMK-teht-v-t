package pankkitili;

public class MaksuKortti {

    private int PIN;
    private int ekaPin;
    private int tokaPin;

    TiliTesti testi = new TiliTesti();

    public void setPinEka(int pin) {
        if (pin >= 0 && pin <= 9999) {
            ekaPin = pin;
        } else {
            System.out.println("Anna PIN uudestaan");
        }
    }

    public void setPinToka(int pin) {
        if (pin >= 0 && pin <= 9999) {
            tokaPin = pin;
        } else {
            System.out.println("Anna PIN uudestaan");
        }
        if (ekaPin == tokaPin) {
            PIN = tokaPin;
            testi.pinOk(true);
        } else {
            testi.pinOk(false);
        }
    }
}
 
