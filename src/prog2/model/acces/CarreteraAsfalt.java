package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CarreteraAsfalt extends AccesAsfalt {

    private int pesMax;

    public CarreteraAsfalt(String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments, int metresQuadrats, int pesMax) {
        super (nom, true, LlistaAllotjaments, metresQuadrats);
        this.pesMax = pesMax;
    }

    public int getPesMax() {
        return pesMax;
    }

    public void setPesMax(int pesMax) {
        this.pesMax = pesMax;
    }
}
