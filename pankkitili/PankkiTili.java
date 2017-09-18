package pankkitili;


public class PankkiTili {
private double saldo = 0;
double nosto;
double pano;

double getSaldo(){
return saldo;
}

public void otto(double määrä){
saldo = saldo + nosto;
}

public void pano(double määrä){
saldo = saldo + määrä;
}

}
