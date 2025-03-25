package prog2.model;

import prog2.model.allotjament.Allotjament;

public class Incidencia {
    private enum TipusIncidencia{
        NETEJA,
        REPARACIO,
        TANCAMENT
    }
    private int IdInceidencia;
    private TipusIncidencia Tipus;
    private Allotjament allotjament;
    private String data;

    public Incidencia (int idInceidencia,TipusIncidencia tipus, Allotjament allotjament, String data){
        this.IdInceidencia = idInceidencia;
        this.Tipus = tipus;
        this.allotjament = allotjament;
        this.data = data;
    }
    public int getIdInceidencia() {
        return IdInceidencia;
    }
    public TipusIncidencia getTipus() {
        return Tipus;
    }
    public Allotjament getAllotjament() {
        return allotjament;
    }
    public String getData() {
        return data;
    }
    public void setIdInceidencia(int idInceidencia) {
        IdInceidencia = idInceidencia;
    }
    public void setTipus(TipusIncidencia tipus) {
        Tipus = tipus;
    }
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String toString(){
        return "Id: " + IdInceidencia + " Tipus: " + Tipus + " Allotjament: " + allotjament.getNom()+ " Data: " + data;
    }

    //Aquest metode el faig  perque  tenim un enum i rebem un string com a tipus d'incidencia
    public static TipusIncidencia convertirTipus(String tipus) {
        try {
            return TipusIncidencia.valueOf(tipus.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error: Tipus d'incidència no vàlid: " + tipus);
        }
    }
}
