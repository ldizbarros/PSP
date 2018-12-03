package ejercicio8;

/**
 * Clase Carrera. Esta clase se encargara de contolar el moviemiento de la
 * liebre y la tortuga.
 * @author ldizbarros
 */
public class Carrera {
    
    private boolean avanzaLiebre=false;
    private boolean avanzaTortuga=false;
    private boolean ganador=false;
    
    /**
     * Este metodo define el movimiento de la liebre.
     * Si esta avanzado la tortuga espera. Si no calculamos la probabilidad.
     * Segun el valor de la probabilidad la liebre avanza o retrocede ciertas 
     * posiciones.
     * @param posicion posicion actual de la liebre
     * @return nueva posicion de la liebre
     * @throws InterruptedException 
     */
    public synchronized int movimientoLiebre(int posicion) throws InterruptedException{
        if (avanzaTortuga==true){
            wait();
        }
        avanzaLiebre=true;
        int pos = posicion;
        int prob = (int) (Math.random() * 100) + 1;
        
        if (prob<=20){
            pos = pos+0;
        }else if (prob>20 && prob<=40){
            pos = pos+9;
        }else if (prob>40 && prob<=50){
            pos = pos-12;
        }else if (prob>50 && prob<=80){
            pos = pos+1;
        }else if (prob>80 && prob<=100){
            pos = pos-2;
        }
        if (pos<0){
            pos=1;
        }
        avanzaLiebre=false;
        notify();
        return pos;
    }
    
    /**
     * Este metodo define el movimiento de la tortuga.
     * Si esta avanzado la liebre espera. Si no calculamos la probabilidad.
     * Segun el valor de la probabilidad la totutuga avanza oretrocede ciertas 
     * posiciones.
     * @param posicion posicion de la tortuga actual
     * @return nueva posicion de la tortuga
     * @throws InterruptedException 
     */
    public synchronized int movimientoTortuga(int posicion) throws InterruptedException{
        if (avanzaLiebre==true){
            wait();
        }
        avanzaTortuga=true;
        int pos = posicion;
        int prob = (int) (Math.random() * 100) + 1;
        
        if (prob<=50){
            pos = pos+3;
        }else if (prob>50 && prob<=70){
            pos = pos-6;
        }else if (prob>70 && prob<=100){
            pos = pos+1;
        }
        if (pos<0){
            pos=1;
        }
        avanzaTortuga=false;
        notify();
        return pos;
    }
    
    /**
     * Metodo que muestra por pantalla el ganador de la carrera.
     * @param ganador indica el ganador
     */
    public void ganador(String ganador){
        if (ganador.equalsIgnoreCase("liebre")){
            System.out.println("HA GANADO LA LIEBRE");
        }else{
            System.out.println("HA GANADO LA TORTUGA");
        }
    }
}
