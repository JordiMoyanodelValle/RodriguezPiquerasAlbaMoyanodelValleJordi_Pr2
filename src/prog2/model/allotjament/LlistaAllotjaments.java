package prog2.model.allotjament;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;

public class LlistaAllotjaments implements InLlistaAllotjaments {
    private ArrayList<Allotjament> llistaallotjaments ;

    public LlistaAllotjaments() {
        ArrayList<Allotjament> llistaallotjaments;
    }

    public void afegirAllotjament(Allotjament allotjament) throws ExcepcioCamping {
        llistaallotjaments.add(allotjament);
    }

    public void buidar() {
        llistaallotjaments.clear();
    }

    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        boolean esOperatiu = (estat.equals("Operatiu"));
        StringBuffer sortida = new StringBuffer();
        for (Allotjament allotjament : llistaallotjaments) {
            if (allotjament.isOperatiu() == esOperatiu || estat.equals("Tots")){
                sortida.append(" "+ allotjament.getNom() + " ");
            }
        }
        return sortida.toString();
    }

    public boolean containsAllotjamentOperatiu() {
        for (Allotjament allotjament : llistaallotjaments) {
            if (allotjament.isOperatiu()) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Allotjament allotjament) {
        for (Allotjament allotjament1 : llistaallotjaments) {
            if (allotjament.getNom().equals(allotjament1.getNom())) {
                return true;
            }
        }

        return false;
    }

    public Allotjament getAllotjament(String id) throws ExcepcioCamping {
        for (Allotjament allotjament : llistaallotjaments) {
            if (allotjament.getId().equals(id)) {
                return allotjament;
            }
        }
        return null;
    }
}
