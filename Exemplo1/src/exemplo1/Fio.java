package exemplo1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio extends Thread{
    
    public int n;
    
    public Fio (int n){
        super();
        this.n=n;
    }
    
    @Override
    public void run(){
        int x= 0;
        int y = 1;
        int z;
        
        System.out.println(x);
        System.out.println(y);
        
        for (int i=1;i<=n;i++){
            z = x+y;
            System.out.println(z);
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio.class.getName()).log(Level.SEVERE, null, ex);
            }
            x=y;
            y=z;
        }
    }
}
