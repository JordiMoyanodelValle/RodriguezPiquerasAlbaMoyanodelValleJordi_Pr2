package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CarreteraAsfalt extends AccesAsfalt {

    private float pesMax;

    public CarreteraAsfalt(String nom,boolean estat, float metresQuadrats, float pesMax) {
        super (nom, true,estat, metresQuadrats);
        this.pesMax = pesMax;
    }

    public float getPesMax() {
        return pesMax;
    }

    public void setPesMax(int pesMax) {
        this.pesMax = pesMax;
    }
}
