package prog2.model;

import prog2.model.acces.*;
import prog2.model.allotjament.*;
import prog2.vista.ExcepcioCamping;

import static prog2.model.Incidencia.convertirTipus;

public class Camping implements InCamping {
    private String nom;
    private LlistaIncidencies llistaIncidencies;
    private LlistaAllotjaments llistaAllotjaments;
    private LlistaAccessos llistaAccessos;

    Camping(String nom) {
        this.nom = nom;
        this.llistaIncidencies = new LlistaIncidencies();
        this.llistaAllotjaments = new LlistaAllotjaments();
        this.llistaAccessos = new LlistaAccessos();
    }

    public String getNomCamping() {
        return this.nom;
    }

    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        return llistaAllotjaments.llistarAllotjaments(estat);
    }

    public String llistarAccessos(String infoEstat) throws ExcepcioCamping {
        //Ho faig aixi perque aqui donen un string i al llista accesos es un boolean
        if (infoEstat.toUpperCase().equals("TOTS")) {
            return llistaAccessos.llistarAccessos(true) + "\n" + llistaAccessos.llistarAccessos(false);
        } else if (infoEstat.toUpperCase().equals("OBERT")) {
            return llistaAccessos.llistarAccessos(true);
        } else if (infoEstat.toUpperCase().equals("TANCAT")) {
            return llistaAccessos.llistarAccessos(false);
        } else {
            throw new ExcepcioCamping("Has d'escollir un estat entre \"TOTS\" , \"OBERT\" i \"TANCAT\"");
        }

    }

    public String llistarIncidencies() throws ExcepcioCamping {
        return llistaIncidencies.llistarIncidencies();
    }

    public void afegirIncidencia(int num, String tipus, String idAllotjament, String data) throws ExcepcioCamping {
        llistaIncidencies.afegirIncidencia(num, tipus, llistaAllotjaments.getAllotjament(idAllotjament), data);
        llistaAllotjaments.getAllotjament(idAllotjament).tancarAllotjament(llistaIncidencies.getIncidencia(num));
        llistaAccessos.actualitzaEstatAccessos();
    }

    public void eliminarIncidencia(int num) throws ExcepcioCamping {
        Incidencia incidencia = llistaIncidencies.getIncidencia(num);
        incidencia.getAllotjament().obrirAllotjament();
        llistaAccessos.actualitzaEstatAccessos();
        llistaIncidencies.eliminarIncidencia(incidencia);

    }

    public int calculaAccessosAccessibles() {
        return llistaAccessos.calculaAccessosAccessibles();
    }

    public float calculaMetresQuadratsAsfalt() {
        return llistaAccessos.calculaMetresQuadratsAsfalt();
    }

    public void save(String camiDesti) throws ExcepcioCamping {

    }

    public void inicialitzaDadesCamping() throws ExcepcioCamping {

        llistaAccessos.buidar();

        float asfalt = 200;
        Acces Acc1 = new CamiAsfalt("A1", true, asfalt);
        llistaAccessos.afegirAcces(Acc1);

        asfalt = 800;
        float pesMaxim = 10000;
        Acces Acc2 = new CarreteraAsfalt("A2", true, asfalt, pesMaxim);
        llistaAccessos.afegirAcces(Acc2);

        float longitud = 100;
        Acces Acc3 = new CamiTerra("A3", true, longitud);
        llistaAccessos.afegirAcces(Acc3);

        longitud = 200;
        float amplada = 3;
        Acces Acc4 = new CarreteraTerra("A4", true, longitud, amplada);
        llistaAccessos.afegirAcces(Acc4);

        asfalt = 350;
        Acces Acc5 = new CamiAsfalt("A5", true, asfalt);
        llistaAccessos.afegirAcces(Acc5);

        asfalt = 800;
        pesMaxim = 12000;
        Acces Acc6 = new CarreteraAsfalt("A6", true, asfalt, pesMaxim);
        llistaAccessos.afegirAcces(Acc6);

        asfalt = 100;
        Acces Acc7 = new CamiAsfalt("A7", true, asfalt);
        llistaAccessos.afegirAcces(Acc7);

        asfalt = 800;
        pesMaxim = 10000;
        Acces Acc8 = new CarreteraAsfalt("A8", true, asfalt, pesMaxim);
        llistaAccessos.afegirAcces(Acc8);

        longitud = 50;
        Acces Acc9 = new CamiTerra("A9", true, longitud);
        llistaAccessos.afegirAcces(Acc9);

        longitud = 400;
        amplada = 4;
        Acces Acc10 = new CarreteraTerra("A10", true, longitud, amplada);
        llistaAccessos.afegirAcces(Acc10);

        longitud = 80;
        Acces Acc11 = new CamiTerra("A11", true, longitud);
        llistaAccessos.afegirAcces(Acc11);

        longitud = 800;
        amplada = 5;
        Acces Acc12 = new CarreteraTerra("A12", true, longitud, amplada);
        llistaAccessos.afegirAcces(Acc12);

        /* Pistes */
        llistaAllotjaments.buidar();

        // Afegir parcel·les:
        //------------------------------
        String nom = "Parcel·la Nord";
        String idAllotjament = "ALL1";
        float mida = 64.0f;
        boolean connexioElectrica = true;
        long estadaMinimaALTA = 7;
        long estadaMinimaBAIXA = 3;
        String iluminacio = "LED";

        Parcela ALL1 = new Parcela(nom, idAllotjament, mida, connexioElectrica, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio);
        llistaAllotjaments.afegirAllotjament(ALL1);

        nom = "Parcel·la Sud";
        idAllotjament = "ALL2";
        Parcela ALL2 = new Parcela(nom, idAllotjament, mida, connexioElectrica, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio);
        llistaAllotjaments.afegirAllotjament(ALL2);

        // Afegir bungalows:
        //------------------------------
        nom = "Bungalow Nord";
        idAllotjament = "ALL3";
        mida = 22f;
        int habitacions = 2;
        int placesPersones = 4;
        int placesParquing = 1;
        boolean terrassa = true;
        boolean tv = true;
        boolean aireFred = true;

        Bungalow ALL3 = new Bungalow(nom, idAllotjament, mida, habitacions, placesPersones, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.afegirAllotjament(ALL3);

        // Afegir bungalows premium:
        //------------------------------
        nom = "Bungalow Sud";
        idAllotjament = "ALL4";
        mida = 27f;
        habitacions = 2;
        placesPersones = 6;
        placesParquing = 1;
        terrassa = true;
        tv = true;
        aireFred = true;
        boolean serveisExtra = true;
        String codiWifi = "CampingDelMarBP1";

        BungalowPremium ALL4 = new BungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.afegirAllotjament(ALL4);

        // Afegir Glamping:
        //------------------------------
        nom = "Glamping Nord";
        idAllotjament = "ALL5";
        mida = 20f;
        habitacions = 1;
        placesPersones = 2;
        String material = "Tela";
        boolean casaMascota = true;

        Glamping ALL5 = new Glamping(nom, idAllotjament, mida, habitacions, placesPersones, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio, material, casaMascota);
        llistaAllotjaments.afegirAllotjament(ALL5);

        // Afegir Mobil-Home:
        //------------------------------
        nom = "Mobil-Home Sud";
        idAllotjament = "ALL6";
        mida = 20f;
        habitacions = 2;
        placesPersones = 4;
        boolean terrassaBarbacoa = true;

        MobilHome ALL6 = new MobilHome(nom, idAllotjament, mida, habitacions, placesPersones, estadaMinimaALTA, estadaMinimaBAIXA, true, iluminacio, terrassaBarbacoa);
        llistaAllotjaments.afegirAllotjament(ALL6);

        /* Accés */
        Acc1.afegirAllotjament(ALL1);
        Acc1.afegirAllotjament(ALL2);
        Acc2.afegirAllotjament(ALL1);
        Acc2.afegirAllotjament(ALL2);
        Acc3.afegirAllotjament(ALL3);
        Acc4.afegirAllotjament(ALL3);
        Acc5.afegirAllotjament(ALL4);
        Acc6.afegirAllotjament(ALL4);
        Acc7.afegirAllotjament(ALL5);
        Acc7.afegirAllotjament(ALL6);
        Acc8.afegirAllotjament(ALL5);
        Acc8.afegirAllotjament(ALL6);
        Acc9.afegirAllotjament(ALL2);
        Acc10.afegirAllotjament(ALL2);
        Acc11.afegirAllotjament(ALL6);
        Acc12.afegirAllotjament(ALL6);
    }
}
