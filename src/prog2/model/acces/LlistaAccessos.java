package prog2.model.acces;

import prog2.model.acces.Acces;
import prog2.model.allotjament.Allotjament;
import prog2.model.allotjament.LlistaAllotjaments;
import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;


public class LlistaAccessos implements InLlistaAccessos {
    ArrayList<Acces> llistaAccessos;

    public LlistaAccessos() {
        llistaAccessos = new ArrayList<Acces>();
    }

    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        llistaAccessos.add(acc);
    }

    public void buidar() {
        llistaAccessos.clear();
    }

    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        StringBuffer sb = new StringBuffer();
        for (Acces acc : llistaAccessos) {
            if (acc.getEstat() == estat){
                sb.append(acc.getNom());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void actualitzaEstatAccessos() throws ExcepcioCamping {
        for (Acces acc : llistaAccessos) {
            acc.tancarAcces();
            ArrayList<Allotjament> llistaAllotjaments = acc.getLlistaAllotjaments();
            for (Allotjament allotjament : llistaAllotjaments){
                if (allotjament.isOperatiu()){
                        acc.obrirAcces();
                }
            }
        }
    }

    public int calculaAccessosAccessibles() throws ExcepcioCamping {
        int total = 0;
        for (Acces acc : llistaAccessos) {
            if (acc.getAccessibilitat()){
                total++;
            }
        }
        return total;
    }

    public float calculaMetresQuadratsAsfalt() throws ExcepcioCamping {
        float metresQuadrats = 0;

        for (Acces acces : llistaAccessos){
            if (acces instanceof AccesAsfalt ){
                metresQuadrats += ((AccesAsfalt) acces).getMetresQuadrats();

            }
        }
        return metresQuadrats;
    }
}
