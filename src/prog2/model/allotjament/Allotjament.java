package prog2.model.allotjament;

import prog2.model.Incidencia;
import prog2.vista.ExcepcioCamping;
import java.time.LocalDate;

public class Allotjament implements InAllotjament {
//Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private String nom;
    private String idAllotjament;
    private float mida;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;
    private boolean estat;
    private String iluminacio;  // No necessitem usar el seu valor numeric

    public Allotjament (String nom, String idAllotjament, float mida, long EstadaMinimaALTA, long EstadaMinimaBAIXA , boolean estat, String iluminacio) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida;
        this.estadaMinimaALTA = EstadaMinimaALTA;
        this.estadaMinimaBAIXA = EstadaMinimaBAIXA;
        this.estat = estat;
        this.iluminacio = iluminacio;

    }
/*                               Getters i setters                            */
    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setId(String id) {
        this.idAllotjament = id;
    }
    public float getMida(){
        return this.mida;
    }
    public void setMida(float mida) {
        this.mida = mida;
    }
    public String getId() {
        return idAllotjament;
    }
    public long getEstadaMinima(Temp temp) {
        if (temp == Temp.ALTA) return this.estadaMinimaALTA;
        else return this.estadaMinimaBAIXA;
    }
    public long getEstadaMinimaTemporadaAlta() {
        return this.estadaMinimaALTA;
    }
    public long getEstadaMinimaTemporadaBaixa() {
        return this.estadaMinimaBAIXA;
    }
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaALTA = estadaMinimaALTA_;
        this.estadaMinimaBAIXA = estadaMinimaBAIXA_;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    public boolean isEstat() {
        return this.estat;
    }

    public void setIluminacio(String iluminacio) {
        this.iluminacio = iluminacio;
    }

    public String getIluminacio() {
        return this.iluminacio;
    }

    public void tancarAllotjament(Incidencia in) {

    }

    public void obrirAllotjament() {

    }


    // He afegit , per validar la estada depenen de quin dia comença aquesta.
    public void validarEstada(LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioCamping {
        long dies = java.time.temporal.ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        Temp temporada = Allotjament.getTemporada(dataEntrada);
        long estadaMinima = getEstadaMinima(temporada);

        if (dies < estadaMinima) {
            throw new ExcepcioCamping("No compleixen l'estada mínima");
        }
    }
    public String toString() {
        return "Nom=" + nom + ", Id=" + idAllotjament +
                ", estada mínima en temp ALTA: " + this.estadaMinimaALTA +
                ", estada mínima en temp BAIXA: " + this.estadaMinimaBAIXA + ".";
    }
    public static Temp getTemporada(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();

        if ((mes > 3 && mes < 9) || (mes == 3 && dia >= 21) || (mes == 9 && dia < 21)) {
            return InAllotjament.Temp.ALTA;
        } else {
            return InAllotjament.Temp.BAIXA;
        }
    }
}
