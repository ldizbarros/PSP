package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase chamada Leer que extende da clase Thread.
 * @author ldizbarros
 */
public class Leer extends Thread{
    
    private Buzon buzon;

    /**
     * Constructor de la clase Leer
     * @param buzon objeto tipo buzon que enlaza esta clase con el Buzon
     */
    public Leer(Buzon buzon) {
        this.buzon = buzon;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo leerMensaje de la clase Buzon.
     */
    @Override
    public void run(){
        try {
            buzon.leerMensaje();
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
