package ba.unsa.etf.rpr;

public class Student {
    private String imeStudenta, prezimeStudenta;
    private int brojIndeksa;
    private Predmet predmet;

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }
}
