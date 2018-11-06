package ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio3 extends Thread{
    
    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Fio3 -- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
