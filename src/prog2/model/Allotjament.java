package prog2.model;

import prog2.vista.ExcepcioReserva;
import java.time.LocalDate;

public class Allotjament implements InAllotjament {
//Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private String nom;
    private String idAllotjament;
    private float mida;
    private long estadaMinimaALTA;
    private long estadaMinimaBAIXA;

    public Allotjament (String nom, String idAllotjament,float mida, long EstadaMinimaALTA, long EstadaMinimaBAIXA) {
        this.nom = nom;
        this.idAllotjament = idAllotjament;
        this.mida = mida;
        this.estadaMinimaALTA = EstadaMinimaALTA;
        this.estadaMinimaBAIXA = EstadaMinimaBAIXA;

    }
//Fem tots els getters i setters
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
//Definim la funció amb la que sabrem si l'allotjament te un correcte funcionament , i el criteri de cada tipus de allotjament
    public boolean correcteFuncionament() {

        if (this instanceof Parcela) {
            Parcela parcela = (Parcela) this;
            return parcela.isConnexioElectrica();

        }

        else if (this instanceof Casa) {
            Casa casa = (Casa) this;
            if (casa instanceof MobilHome) {
                MobilHome mobilHome = (MobilHome) casa;
                return mobilHome.isTerrassaAmbBarbacoa();
            }


            else if (casa instanceof Glamping) {
                Glamping glamping = (Glamping) casa;
                return glamping.isCasaMascotes();
            }


            else if (casa instanceof Bungalow) {
                Bungalow bungalow = (Bungalow) casa;
                if (bungalow instanceof BungalowPremium) {
                    BungalowPremium bungalowPre = (BungalowPremium) bungalow;
                    return bungalowPre.getCodiWifi().length() >= 8 && bungalowPre.getCodiWifi().length() <= 16 && bungalowPre.isAireFred();
                }
                else { /* Si bungalow no és de tipus premium */
                    return bungalow.isAireFred();
                }
            }

            else { /* Si casa no és de cap dels tipus definits de Casa */
                return false;
            }
        }

        else { /* Si allotjament no és de cap dels tipus definits d'Allotjament */
            return false;
        }
    }

    /* He fet "if-else" ja que aquest codi només el cridem des del nostre codi (Camping.java)*/
    public long getEstadaMinima(Temp temp) {
        if (temp == Temp.ALTA) return this.estadaMinimaALTA;
        else return this.estadaMinimaBAIXA;
    }
    //No son necessaris pero fa més rapids algunes altres funcions així no tenim que cridar a la funció getTemporada
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

    // No hi habia cap funció per detectar la data actual


    // He afegit , per validar la estada depenen de quin dia comença aquesta.
    public void validarEstada(LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        long dies = java.time.temporal.ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        Temp temporada = Allotjament.getTemporada(dataEntrada);
        long estadaMinima = getEstadaMinima(temporada);

        if (dies < estadaMinima) {
            throw new ExcepcioReserva("No compleixen l'estada mínima");
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
