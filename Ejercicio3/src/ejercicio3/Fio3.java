package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio3 extends Fio2{
     
    @Override
    public void run(){
        System.out.println("OLAAA! Son o Fio3");
        Fio4 f4 = new Fio4();
        f4.start();
        for (int i=1;i<=10;i++){
            if (i==10){
                try {
                    f4.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Fio3 Ejecucion "+i);
            try {
                Thread.sleep((int) ((Math.random() * 600) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("TERMINA FIO3");
    }
}
