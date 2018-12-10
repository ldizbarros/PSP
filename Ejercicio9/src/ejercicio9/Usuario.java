package ejercicio9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Usuario. Esta clase define a los usuarios del ascensor.
 * Tiene dos atributos:
 * piso que es el piso en el que el usuario llama al ascensor
 * ascensor un objeto tipo ascensor que nos relaciona el usuario con el 
 * ascensor.
 * @author ldizbarros
 */
public class Usuario extends Thread{
    
    private int piso;
    private Ascensor ascensor;

    /**
     * Constructor de la clase.
     * @param piso piso en el que se sube el usuario
     * @param ascensor objeto tipo ascensor en el que se "monta" el usuario
     */
    public Usuario(int piso, Ascensor ascensor) {
        this.piso = piso;
        this.ascensor = ascensor;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al ascensor a un determinado piso mediante el metodo
     * pedirAscensor, donde le pasamos el piso en el que estamos.
     */
    @Override
    public void run (){
        try {
            System.out.println("Pidiendo ascensor para el piso "+piso);
            ascensor.pedirAscensor(piso);
        } catch (InterruptedException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
