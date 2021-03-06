package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio2 extends Thread{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo mostra o nome do Fio2 5 veces e despois ten un 
     * descanso de un segundo.
     */
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Fio2 -- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
