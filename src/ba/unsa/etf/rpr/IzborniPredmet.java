package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class IzborniPredmet extends Predmet{
    private String nazivPredmeta;
    private int brojECTS;
    private ArrayList<Student> listaStudenata;

    public int getBrojECTS() {
        return brojECTS;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }
    public void dodajStudenta(Student student){
        listaStudenata.add(student);
    }
}
