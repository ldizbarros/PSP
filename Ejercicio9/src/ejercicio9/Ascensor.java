package ejercicio9;

/**
 * Clase Ascensor. Esta clase se encargara del movimiento del ascensor.
 * Tiene dos atributos:
 * planta que marca la posicion actual del ascesor 
 * moviendo boleano que marca si se esta moviendo el ascensor o no
 * @author ldizbarros
 */
public class Ascensor {
    
    private int planta=19;
    private boolean moviendo=false;
    
    /**
     * Metodo que llama al ascensor si no se esta moviendo.
     * @param piso piso al que se llama el ascensor
     * @throws InterruptedException excepcion
     */
    public synchronized void pedirAscensor(int piso) throws InterruptedException{
        if(moviendo==true){
            wait();
        }
        moverAscensor(piso); 
    }
    
    /**
     * Mueve el ascensor. Si el ascensor se esta moviendo espera si no mientras 
     * la planta donde esta no sea la misma que el piso donde se le llama se mueve.
     * Al final indica la planta donde llega.
     * @param piso
     * @throws InterruptedException 
     */
    public synchronized void moverAscensor(int piso) throws InterruptedException{
        if(moviendo==true){
            wait();
        }
        moviendo=true;    
        while(planta!=piso){
            if(planta>piso){
                System.out.println("Bajando......");    
                planta--;   
                Thread.sleep(500);    
            }else if(planta<piso){  
                System.out.println("Subiendo....");   
                planta++;   
                Thread.sleep(500); 
            }
        }   
        System.out.println("El ascesor a llegado a la palanta "+planta);
        moviendo=false; 
        notify();  
    }
}
