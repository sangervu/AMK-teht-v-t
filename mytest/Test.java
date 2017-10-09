package mytest;

public class Test {

    private String abc;
    private double glukoosi;
    private int lukumäärä;

    public void setGlukoosi(double a, String b, int c) {
        this.glukoosi = a;
        this.abc = b;
        this.lukumäärä = c;
    }

    public double getGlukoosi() {

        return glukoosi;
    }

    public String getAbc() {
        return abc;
    }

    public int getLukumäärä() {
        return lukumäärä;
    }

}
