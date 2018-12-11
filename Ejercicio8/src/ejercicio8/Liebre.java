package ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Liebre. Uno de los participantes de la carrera.
 * Tiene como atributos un entero que marca la posicion del animal
 * y otro tipo Carrera que nos ayuda a relacionar a la Liebre con la carrera.
 * @author ldizbarros
 */
public class Liebre extends Thread{
    
    private int posicion=1;
    private Carrera carrera;

    /**
     * Contructor de la clase Liebre. 
     * @param carrera parametro tipo carrera 
     */
    public Liebre(Carrera carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo llama al metodo movimientoLiebre de la clase Carrera
     * mientras la posicion sea menor que 70, es decir, mientras no se acabe
     * la carrera. Luego se para durante un segundo.
     * Al llegar a la posicion 70 dice que la liebre acabo la carrera.
     */
    @Override
    public void run(){
        while(posicion<70){
            try {
                if (Carrera.ganador==true){
                    this.stop();
                }else{
                    posicion=carrera.movimientoLiebre(posicion);
                    System.out.println("LIEBRE --> Posicion: "+posicion);
                    this.sleep(1000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        carrera.ganador("liebre");
        this.stop();
    }
}
