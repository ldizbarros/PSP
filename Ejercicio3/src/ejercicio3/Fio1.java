package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Fio1 extends Thread{
     
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo indica que se iniciou o fio con un saudo.
     * Despois crea un fio fillo chamado fio2 e arrancao.
     * Logo empeza un bucle de 10 iteracions onde se mostrara un mesaxe por
     * cada iteracion. Despois de mostrar o mesaxe hay unha espera aleatoria.
     * Cando chegue a ultima iteracion, antes de rematar o bucle faise un 
     * join para asegurarse que o fio fillo remata antes co pai.
     * Por ultmo indicamos que termina o fio.
     */
    @Override
    public void run(){
        System.out.println("OLAAA! Son o Fio1");
        Fio2 f2 = new Fio2();
        f2.start();
        for (int i=1;i<=10;i++){
            if (i==10){
                try {
                    f2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Fio1 Ejecucion "+i);
            try {
                Thread.sleep((int) ((Math.random() * 600) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("TERMINA FIO1");
    }
}
