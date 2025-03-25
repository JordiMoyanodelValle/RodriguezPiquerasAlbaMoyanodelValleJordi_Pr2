package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class Acces implements InAcces {

    private String nom;
    private boolean accessibilitat;
    private ArrayList<Allotjament> LlistaAllotjaments;
    private boolean estat;

    public Acces (String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments, boolean estat) {
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.LlistaAllotjaments = LlistaAllotjaments;
        this.estat = estat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean getAccessibilitat() {
        return accessibilitat;
    }

    public void setAccessibilitat(boolean accessibilitat) {
        this.accessibilitat = accessibilitat;
    }

    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return LlistaAllotjaments;
    }

    public void afegirAllotjament(Allotjament allotjament) {
        LlistaAllotjaments.add(allotjament);
    }

    public void tancarAcces() {
        this.estat = false;
    }

    public void obrirAcces() {
        this.estat = true;
    }

    public boolean isAccessibilitat() {

        return false;
    }
}
