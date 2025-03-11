package prog2.model;

import prog2.model.allotjament.Allotjament;

public class Incidencia {
    private enum TipusIncidencia{
        NETEJA,
        REPARACIO,
        TANCAMENT
    }
    private String IdInceidencia;
    private TipusIncidencia Tipus;
    private Allotjament allotjament;
    private long data;

    public Incidencia (String idInceidencia,TipusIncidencia tipus, Allotjament allotjament, long data){
        this.IdInceidencia = idInceidencia;
        this.Tipus = tipus;
        this.allotjament = allotjament;
        this.data = data;
    }
    public String getIdInceidencia() {
        return IdInceidencia;
    }
    public TipusIncidencia getTipus() {
        return Tipus;
    }
    public Allotjament getAllotjament() {
        return allotjament;
    }
    public long getData() {
        return data;
    }
    public void setIdInceidencia(String idInceidencia) {
        IdInceidencia = idInceidencia;
    }
    public void setTipus(TipusIncidencia tipus) {
        Tipus = tipus;
    }
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }
    public void setData(long data) {
        this.data = data;
    }
}
