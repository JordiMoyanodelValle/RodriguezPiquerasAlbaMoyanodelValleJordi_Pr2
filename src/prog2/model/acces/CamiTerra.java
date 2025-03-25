package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CamiTerra extends AccesTerra {

    public CamiTerra(String nom, ArrayList<Allotjament> LlistaAllotjaments,boolean estat, int longitud) {
        super(nom, false, LlistaAllotjaments,estat, longitud);
    }

}
