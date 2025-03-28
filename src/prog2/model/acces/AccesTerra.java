package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class AccesTerra extends Acces {

    private float longitud;

    public AccesTerra (String nom, boolean accessibilitat,boolean estat,float longitud) {
        super (nom, accessibilitat, estat);
        this.longitud = longitud;

    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String toString() {
        return super.toString() + " | Longitud: " + longitud;
    }
}

