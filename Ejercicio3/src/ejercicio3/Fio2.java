package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio2 extends Fio1{
     
    @Override
    public void run(){
        System.out.println("OLAAA! Son o Fio2");
        Fio3 f3 = new Fio3();
        f3.start();
        for (int i=1;i<=10;i++){
            if (i==10){
                try {
                    f3.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Fio2 Ejecucion "+i);
            try {
                Thread.sleep((int) ((Math.random() * 600) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("TERMINA FIO2");
    }
}
