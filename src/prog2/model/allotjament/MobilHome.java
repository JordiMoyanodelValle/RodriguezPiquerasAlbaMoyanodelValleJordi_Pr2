package prog2.model.allotjament;

public class MobilHome extends Casa{
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private boolean terrassaAmbBarbacoa;

    public MobilHome(String nom, String idAllotjament, float mida, int habitacions, int placesPersones, long estadaMinimaALTA,
                     long estadaMinimaBAIXA, boolean estat, String iluminacio, boolean terrassaAmbBarbacoa) {
        super(nom, idAllotjament, mida, habitacions, placesPersones,5,3, estat, iluminacio);
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;
    }
    //Fem tots els getters i setters
    public boolean isTerrassaAmbBarbacoa() {
        return terrassaAmbBarbacoa;
    }

    public void setTerrassaAmbBarbacoa(boolean terrassaAmbBarbacoa) {
        this.terrassaAmbBarbacoa = terrassaAmbBarbacoa;

    }
}