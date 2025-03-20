package prog2.model;

import prog2.vista.ExcepcioCamping;

public class Client {

    private String nom;
    private String dni;

    public Client(String nom , String dni) throws ExcepcioCamping {
        this.nom = nom;
        if (dni.length() == 9) {
            this.dni = dni;
        }
        else {
            throw new ExcepcioCamping("El DNI ha de tenir 9 caràcters.");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString() {
        return nom + " amb DNI: " + dni;
    }

}