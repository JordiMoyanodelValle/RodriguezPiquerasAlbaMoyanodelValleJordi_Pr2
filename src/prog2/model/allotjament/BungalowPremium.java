package prog2.model.allotjament;

public class BungalowPremium extends Bungalow{
    //Definim els atributs i el constructor (si te super es perque herencia d'una clase superior)
    private boolean serveisExtra;
    private String codiWifi;

    public BungalowPremium(String nom, String idAllotjament, float mida, int habitacions, int placesPersones, long estadaMinimaALTA,
                           long estadaMinimaBAIXA, boolean estat, String iluminacio, int placesParking, boolean terrassa,
                           boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom, idAllotjament, mida, habitacions, placesPersones, 7, 4, estat,
                iluminacio, placesParking, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }
    //Fem tots els getters i setters
    public boolean isServeisExtra() {
            return serveisExtra;
        }

    public void setServeisExtra(boolean serveisExtra) {
            this.serveisExtra = serveisExtra;
        }

    public String getCodiWifi () {
            return codiWifi;
        }

    public void setCodiWifi(String codiWifi) {
            this.codiWifi = codiWifi;
        }

}