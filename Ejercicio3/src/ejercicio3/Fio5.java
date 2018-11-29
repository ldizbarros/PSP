package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio5 extends Fio4{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo indica que se iniciou o fio con un saudo.
     * Logo empeza un bucle de 10 iteracions onde se mostrara un mesaxe por
     * cada iteracion. Despois de mostrar o mesaxe hay unha espera aleatoria.
     * Por ultmo indicamos que termina o fio.
     */
    @Override
    public void run(){
        System.out.println("OLAAA! Son o Fio5");
        for (int i=1;i<=10;i++){
            System.out.println("Fio5 Ejecucion "+i);
            try {
                Thread.sleep((int) ((Math.random() * 600) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("TERMINA FIO5");
    }
}
