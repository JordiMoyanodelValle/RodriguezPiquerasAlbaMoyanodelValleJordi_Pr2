package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class AccesTerra extends Acces {

    private int longitud;

    public AccesTerra (String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments,boolean estat, int longitud) {
        super (nom, accessibilitat, LlistaAllotjaments, estat);
        this.longitud = longitud;

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String toString() {
        return super.toString() + " | Longitud: " + longitud;
    }
}

