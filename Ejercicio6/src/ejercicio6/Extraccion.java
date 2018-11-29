package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase chamada Extraccion que extende da clase Thread.
 * @author ldizbarros
 */
public class Extraccion extends Thread{

    private Cuenta cuenta;
    private double extraccion;

    /**
     * Constructor da clase Extraccion
     * @param cuenta objeto tipo cuenta que nos relaciona esta clase con la
     * la clase cuenta.
     * @param extraccion cantidad que se va a extraer de la cuenta.
     */
    public Extraccion(Cuenta cuenta, double extraccion) {
        this.cuenta = cuenta;
        this.extraccion= extraccion;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo retirarSaldo de la clase Ceunta.
     */
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            try {
                cuenta.retirarSaldo(extraccion);
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Extraccion.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
}
