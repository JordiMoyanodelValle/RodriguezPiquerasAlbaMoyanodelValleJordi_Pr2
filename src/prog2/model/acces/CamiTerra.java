package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class CamiTerra extends AccesTerra {

    public CamiTerra(String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments, int longitud) {
        super(nom, false, LlistaAllotjaments, longitud);
    }

}
