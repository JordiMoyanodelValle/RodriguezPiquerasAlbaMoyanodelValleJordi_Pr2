package prog2.model.acces;

import prog2.model.allotjament.Allotjament;

import java.util.ArrayList;

/**
 * Interfície que defineix les operacions bàsiques d'un accés.
 */
public interface InAcces {

    String getNom();

    void setNom(String nom);

    boolean getAccessibilitat();

    void setAccessibilitat(boolean accessibilitat);

    ArrayList<Allotjament> getLlistaAllotjaments();

    /**
     * Afegeix un allotjament rebut com a paràmetre a la llista d'allotjaments de l'accés
     * @param allotjament
     */
    public void afegirAllotjament(Allotjament allotjament);
    
    /**
     * Canvia l'estat de l'accés a tancat
     */
    public void tancarAcces();
    
    /**
     * Canvia l'estat de l'accés a obert 
     */
    public void obrirAcces();
    
        
    /**
     * Retorna si l'accés permet accessibilitat amb cotxe o no.
     * @return 
     */
    public boolean isAccessibilitat();
}
