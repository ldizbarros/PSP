package ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio1 extends Thread{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo mostra o nome do Fio1 10 veces e despois ten un 
     * descanso de un tempo aleatorio.
     */
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Fio1 -- "+i);
            try {
                Thread.sleep((int) ((Math.random() * 1000) + 1));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
