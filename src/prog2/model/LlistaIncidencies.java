package prog2.model;

import prog2.model.Incidencia;
import prog2.model.allotjament.Allotjament;
import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;
import static prog2.model.Incidencia.convertirTipus;

public class LlistaIncidencies implements InLlistaIncidencies {
    private ArrayList<Incidencia> incidencies;

    public LlistaIncidencies() {
        incidencies = new ArrayList<Incidencia>();
    }

    public void afegirIncidencia(int idIncidencia, String tipus, Allotjament allotjament, String data) throws ExcepcioCamping {
        boolean YaTeIncidencia = false;
        for (Incidencia incidencia : incidencies) {
            if (incidencia.getAllotjament().equals(allotjament)) {
                throw new ExcepcioCamping("L'allotjament ja te una incidencia");
            }
        }
        incidencies.add(new Incidencia(idIncidencia, convertirTipus(tipus),allotjament,data));
    }
    public void eliminarIncidencia(Incidencia in) throws ExcepcioCamping{
        Allotjament allotjament = in.getAllotjament();
        incidencies.remove(in);
        allotjament.isOperatiu();

    }
    public String llistarIncidencies() throws ExcepcioCamping{
        StringBuffer bf = new StringBuffer();
        if (incidencies.isEmpty()) {
            throw new ExcepcioCamping("La llista d'incidencies esta vuida");
        }
        else{
            for (Incidencia incidencia : incidencies) {
                bf.append(incidencia.toString());bf.append("\n");
            }

        }
        return bf.toString();
    }
    public Incidencia getIncidencia(int idIncidencia) {
        for (Incidencia incidencia : incidencies) {
            if (incidencia.getIdInceidencia() == idIncidencia) {
                return incidencia;
            }
        }
        return null;
    }




}
