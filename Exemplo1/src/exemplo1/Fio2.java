package exemplo1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio2 extends Thread{
    
    public int n;
    
    public Fio2 (int n){
        super();
        this.n=n;
    }
    
    @Override
    public void run(){
       for (int i=1;i<=n;i++){
            System.out.println("hola");
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
