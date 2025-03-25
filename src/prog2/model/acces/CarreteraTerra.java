package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CarreteraTerra extends AccesTerra {

    private int amplada;

    public CarreteraTerra(String nom, ArrayList<Allotjament> LlistaAllotjaments,boolean estat, int longitud, int amplada) {
        super(nom, true, LlistaAllotjaments,estat, longitud);
        this.amplada = amplada;
    }

    public int getAmplada() {
        return amplada;
    }

    public void setAmplada(int amplada) {
        this.amplada = amplada;
    }
}
