package prog2.model;

import prog2.model.acces.LlistaAccessos;
import prog2.model.allotjament.Allotjament;
import prog2.model.allotjament.LlistaAllotjaments;
import prog2.vista.ExcepcioCamping;

import static prog2.model.Incidencia.convertirTipus;

public class Camping implements InCamping{
    private String nom;
    private LlistaIncidencies llistaIncidencies;
    private LlistaAllotjaments llistaAllotjaments;
    private LlistaAccessos llistaAccessos;

    Camping (String nom){
        this.nom = nom;
        this.llistaIncidencies = new LlistaIncidencies();
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.llistaAccessos = new LlistaAccessos();
    }

    public String getNomCamping() {
        return this.nom ;
    }

    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        return llistarAllotjaments(estat);
    }

    public String llistarAccessos(String infoEstat) throws ExcepcioCamping {
        return llistarAccessos(infoEstat);
    }

    public String llistarIncidencies() throws ExcepcioCamping {
        return llistarIncidencies();
    }

    public void afegirIncidencia(int num, String tipus, String idAllotjament, String data) throws ExcepcioCamping {
        llistaIncidencies.afegirIncidencia(num,tipus,llistaAllotjaments.getAllotjament(idAllotjament), data);
    }

    public void eliminarIncidencia(int num) throws ExcepcioCamping {
        llistaIncidencies.eliminarIncidencia(llistaIncidencies.getIncidencia(num));
    }

    public int calculaAccessosAccessibles() {
        return 0;
    }

    public float calculaMetresQuadratsAsfalt() {
        return 0;
    }

    public void save(String camiDesti) throws ExcepcioCamping {

    }

    public void inicialitzaDadesCamping() {

    }
}
