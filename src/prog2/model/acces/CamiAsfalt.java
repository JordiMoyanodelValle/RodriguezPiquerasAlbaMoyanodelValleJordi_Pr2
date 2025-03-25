package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CamiAsfalt extends AccesAsfalt {

    public CamiAsfalt(String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments,boolean estat, int metresQuadrats) {
        super (nom, false, LlistaAllotjaments,estat, metresQuadrats);
    }
}
