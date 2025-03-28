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
        llistaAllotjaments.getAllotjament(idAllotjament).tancarAllotjament(llistaIncidencies.getIncidencia(num));
        llistaAccessos.actualitzaEstatAccessos();
    }

    public void eliminarIncidencia(int num) throws ExcepcioCamping {
        Incidencia incidencia = llistaIncidencies.getIncidencia(num);
        incidencia.getAllotjament().obrirAllotjament();
        llistaAccessos.actualitzaEstatAccessos();
        llistaIncidencies.eliminarIncidencia(incidencia);

    }

    public int calculaAccessosAccessibles(){
        return llistaAccessos.calculaAccessosAccessibles();
    }

    public float calculaMetresQuadratsAsfalt() {
        return llistaAccessos.calculaMetresQuadratsAsfalt();
    }

    public void save(String camiDesti) throws ExcepcioCamping {

    }

    public void inicialitzaDadesCamping() {

    }
}
