package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class AccesAsfalt extends Acces{

    private int metresQuadrats;

    public AccesAsfalt (String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments, int metresQuadrats) {
        super (nom, accessibilitat, LlistaAllotjaments);
        this.metresQuadrats = metresQuadrats;

    }

    public int getMetresQuadrats() {
        return metresQuadrats;
    }

    public void setMetresQuadrats(int metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }
}
