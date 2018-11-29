package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase chamada Escribir que extende da clase Thread.
 * @author ldizbarros
 */
public class Escribir extends Thread{
    
    private String mensaje;
    private Buzon buzon;

    /**
     * Constructor da clase Escribir.
     * @param mensaje mensaje que se va a escribir
     * @param buzon objeto tipo buzon que enlaza esta clase con el Buzon
     */
    public Escribir(String mensaje, Buzon buzon) {
        this.mensaje = mensaje;
        this.buzon = buzon;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo escribirMensaje de la clase Buzon.
     */
    @Override
    public void run(){
        try {
            buzon.escribirMensaje(mensaje);
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
