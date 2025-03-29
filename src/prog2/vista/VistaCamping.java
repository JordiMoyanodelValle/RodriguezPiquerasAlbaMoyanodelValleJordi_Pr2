package prog2.vista;

import prog2.model.Camping;

public class VistaCamping {

    private Camping camping;

    public VistaCamping(String nomCamping) throws ExcepcioCamping {

        Camping camping1 = new Camping(nomCamping);
        this.camping = camping1;
        camping.inicialitzaDadesCamping();
    }

    public void gestioCamping() {
    }
}
