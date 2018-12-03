package ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Tortuga. Participante de la carrera.
 * Tiene como atributos un entero que marca la posicion del animal
 * y otro tipo Carrera que nos ayuda a relacionar a la Tortuga con la carrera.
 * @author ldizbarros
 */
public class Tortuga extends Thread{
    
    private int posicion=1;
    private Carrera carrera;

    /**
     * Contructor de la clase Tortuga. 
     * @param carrera parametro tipo carrera 
     */
    public Tortuga(Carrera carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo movimientoTortuga de la clase Carrera
     * mientras la posicion sea menor que 70, es decir, mientras no se acabe
     * la carrera. Luego se para durante un segundo.
     * Al llegar a la posicion 70 dice que la tortuga acabo la carrera.
     */
    @Override
    public void run(){
        while(posicion<70){
            try {
                posicion=carrera.movimientoTortuga(posicion);
                System.out.println("TORTUGA --> Posicion: "+posicion);
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        carrera.ganador("tortuga");
        this.stop();
    }
}
