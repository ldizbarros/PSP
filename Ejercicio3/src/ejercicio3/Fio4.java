package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio4 extends Fio3{
     
    @Override
    public void run(){
        System.out.println("OLAAA! Son o Fio4");
        Fio5 f5 = new Fio5();
        f5.start();
        for (int i=1;i<=10;i++){
            if (i==10){
                try {
                    f5.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Fio4 Ejecucion "+i);
            try {
                Thread.sleep((int) ((Math.random() * 600) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("TERMINA FIO4");
    }
}
