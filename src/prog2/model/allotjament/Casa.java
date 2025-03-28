package prog2.model.allotjament;

public class Casa extends Allotjament{

    private int habitacions;
    private int placesPersones;


    public Casa (String nom, String idAllotjament, float mida, int habitacions, int placesPersones, long estadaMinimaALTA,
                 long estadaMinimaBAIXA, boolean estat, String iluminacio) {
        super(nom, idAllotjament, mida, estadaMinimaALTA, estadaMinimaBAIXA, estat, iluminacio);
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;

    }



    public int getHabitacions() {
        return habitacions;
    }

    public int getPlacesPersones() {
        return placesPersones;
    }

    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    public void setPlacesPersones(int capacitat) {
        this.placesPersones = capacitat;
    }

}