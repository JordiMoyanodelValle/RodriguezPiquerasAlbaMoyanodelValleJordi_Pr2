package prog2.model.allotjament;

public class Bungalow extends Casa {
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private int placesParking;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    public Bungalow (String nom, String idAllotjament, float mida, int habitacions, int placesPersones, long estadaMinimaALTA,
                     long estadaMinimaBAIXA, boolean estat, String iluminacio, int placesParking, boolean terrassa, boolean tv, boolean aireFred) {
        super (nom, idAllotjament, mida, habitacions, placesPersones, 7, 4, estat, iluminacio);
        this.placesParking = placesParking;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    //Fem tots els getters i setters
    public int getPlacesParquing() {
        return placesParking;
    }

    public void setPlacesParquing(int placesParquing) {
        this.placesParking = placesParquing;
    }

    public boolean isTerrassa() {
        return terrassa;
    }

    public void setTerrassa(boolean terrassa) {
        this.terrassa = terrassa;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isAireFred() {
        return aireFred;
    }

    public void setAireFred(boolean aireFred) {
        this.aireFred = aireFred;
    }

}