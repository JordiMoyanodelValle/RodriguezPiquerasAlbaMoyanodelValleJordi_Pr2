package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

public class Acces implements InAcces {

    private String nom;
    private boolean accessibilitat;
    private ArrayList<Allotjament> LlistaAllotjaments;

    public Acces (String nom, boolean accessibilitat, ArrayList<Allotjament> LlistaAllotjaments) {
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.LlistaAllotjaments = LlistaAllotjaments;
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

    }

    public void tancarAcces() {

    }

    public void obrirAcces() {

    }

    public boolean isAccessibilitat() {
        return false;
    }
}
