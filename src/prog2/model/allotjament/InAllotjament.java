package prog2.model.allotjament;

import prog2.model.Incidencia;
import prog2.vista.ExcepcioCamping;

import java.time.LocalDate;

/**
 * Interfície que defineix les operacions bàsiques per als allotjaments.
 */
public interface InAllotjament {

    /**
     * Obté el nom de l'allotjament.
     * @return el nom de l'allotjament.
     */
    String getNom();

    /**
     * Estableix el nom de l'allotjament.
     * @param nom el nom a assignar.
     */
    void setNom(String nom);

    /**
     * Obté l'identificador únic de l'allotjament.
     * @return l'identificador únic de l'allotjament.
     */
    String getId();

    /**
     * Estableix l'identificador únic de l'allotjament.
     * @param id l'identificador a assignar.
     */
    void setId(String id);

    /**
     * Obté l'estada mínima segons la temporada.
     * @param temp la temporada (ALTA o BAIXA).
     * @return el valor de l'estada mínima per a la temporada indicada.
     */
    long getEstadaMinima(Temp temp);

    /**
     * Estableix l'estada mínima per a cada temporada.
     * @param estadaMinimaALTA_ l'estada mínima en temporada alta.
     * @param estadaMinimaBAIXA_ l'estada mínima en temporada baixa.
     */
    void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_);

    long getEstadaMinimaTemporadaAlta();

    long getEstadaMinimaTemporadaBaixa();

    /**
     * Enumeració que representa les diferents temporades possibles.
     */
    enum Temp {
        ALTA,
        BAIXA
    }

    void setEstat(boolean estat);

    boolean isEstat();

    void setIluminacio(String iluminacio);

    String getIluminacio();

    /**
     * Modifica l'estat de l'allotjament a No Operatiu i la il·luminació depenent de la incidència rebuda com a paràmetre
     * @param in Objecte de tipus Incidencia.
     */
    void tancarAllotjament(Incidencia in);

    /**
     * Modifica l'estat de l'allotjament a Operatiu i la il·luminació al 100%
     */
    void obrirAllotjament();

    void validarEstada(LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioCamping;

    String toString();
}
