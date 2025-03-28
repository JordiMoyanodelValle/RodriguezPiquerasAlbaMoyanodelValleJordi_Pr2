package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CarreteraTerra extends AccesTerra {

    private float amplada;

    public CarreteraTerra(String nom,boolean estat, float longitud, float amplada) {
        super(nom, true,estat, longitud);
        this.amplada = amplada;
    }

    public float getAmplada() {
        return amplada;
    }

    public void setAmplada(float amplada) {
        this.amplada = amplada;
    }
}
