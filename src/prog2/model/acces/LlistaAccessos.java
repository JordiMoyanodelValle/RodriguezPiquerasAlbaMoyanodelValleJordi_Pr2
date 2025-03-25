package prog2.model.acces;

import prog2.model.acces.Acces;
import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;


public class LlistaAccessos implements InLlistaAccessos {
    ArrayList<Acces> llistaAccessos;

    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        llistaAccessos.add(acc);
    }

    public void buidar() {
        llistaAccessos.clear();
    }

    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        for (Acces acc : llistaAccessos) {}
        return "";
    }

    public void actualitzaEstatAccessos() throws ExcepcioCamping {

    }

    public int calculaAccessosAccessibles() throws ExcepcioCamping {
        return 0;
    }

    public float calculaMetresQuadratsAsfalt() throws ExcepcioCamping {
        for (Acces acces : llistaAccessos){

        }
    }
}
