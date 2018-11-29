package ejercicio5;

/**
 * Clase Fio que extende de Thread
 * @author ldizbarros
 */
public class Fio  extends Thread{
    
    private int num;

    /**
     * Contructor da clase Fio
     * @param num numero que damos ao Fio para identificalo
     */
    public Fio(int num) {
        this.num = num;
    }
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * O unico que fai o fio e mostrar unha mensaxe co numero do fio que se
     * executa.
     */
    @Override
    public void run(){
        System.out.println("Ola, son o fío número "+num);         
    }
}
