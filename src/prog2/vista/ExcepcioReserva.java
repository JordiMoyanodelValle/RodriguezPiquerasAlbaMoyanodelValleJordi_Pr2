package prog2.vista;

/**
 *
 * @author lauraigual
 */
public class  ExcepcioCamping extends Exception {

    public ExcepcioCamping(String message) {
        super(message);
    }

    public ExcepcioCamping() {
        super("S'ha produit un error en la reserva.");
    }
    
}
