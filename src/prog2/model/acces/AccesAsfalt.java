package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class AccesAsfalt extends Acces{

    private float metresQuadrats;

    public AccesAsfalt (String nom, boolean accessibilitat,boolean estat, float metresQuadrats) {
        super (nom, accessibilitat, estat);
        this.metresQuadrats = metresQuadrats;

    }

    public float getMetresQuadrats() {
        return metresQuadrats;
    }

    public void setMetresQuadrats(float metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }
    public String toString() {
        return super.toString() + " | Metres quadrats: " + metresQuadrats;
    }
}
