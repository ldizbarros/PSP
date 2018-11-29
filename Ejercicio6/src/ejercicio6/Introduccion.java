package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase chamada Introduccion que extende da clase Thread.
 * @author ldizbarros
 */
public class Introduccion extends Thread{
    
    private Cuenta cuenta;
    private double introduccion;

    /**
     * Constructor da clase Introduccion
     * @param cuenta objeto tipo cuenta que nos relaciona esta clase con la
     * la clase cuenta.
     * @param introduccion cantidad que se va a introducir de la cuenta.
     */
    public Introduccion(Cuenta cuenta, double introduccion) {
        this.cuenta = cuenta;
        this.introduccion= introduccion;
    }
        
     /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo ingresarSaldo de la clase Ceunta.
     */
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                cuenta.ingresarSaldo(introduccion);
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Extraccion.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
}
