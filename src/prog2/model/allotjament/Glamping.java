package prog2.model.allotjament;

public class Glamping extends Casa{

    private String material;
    private boolean casaMascotes;

    public Glamping(String nom, String idAllotjament, float mida, int habitacions, int placesPersones, long estadaMinimaALTA,
                    long estadaMinimaBAIXA, boolean estat, String iluminacio, String material, boolean casaMascotes) {
        super(nom, idAllotjament, mida, habitacions, placesPersones,5,3, estat, iluminacio);
        this.material = material;
        this.casaMascotes = casaMascotes;
    }
    //Fem tots els getters i setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isCasaMascotes() {
        return casaMascotes;
    }

    public void setCasaMascotes(boolean casaMascotes) {
        this.casaMascotes = casaMascotes;
    }

}