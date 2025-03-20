package prog2.model.allotjament;

public class Parcela extends Allotjament {
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private boolean connexioElectrica;

    public Parcela (String nom, String idAllotjament, float mida, boolean connexioElectrica, long estadaMinimaALTA,
                    long estadaMinimaBAIXA, boolean estat, String iluminacio){
        super(nom, idAllotjament, mida, 4, 2, estat, iluminacio);
        this.connexioElectrica = connexioElectrica;
    }
    //Fem tots els getters i setters

    public boolean isConnexioElectrica(){
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean con){
        this.connexioElectrica = con;
    }
}
