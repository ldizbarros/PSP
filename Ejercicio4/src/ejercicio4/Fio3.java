package ejercicio4;

public class Fio3 extends Thread{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo indica que comeza o Fio3. Logo ten un bucle onde se suman 
     * os numeros que rematan en 2 ou en 3 dos primerios 10 numeros enteiros.
     * Antes de rematar o fio mostra a suma de todos os numeros que rematan en 
     * 2 ou en 3.
     */
    @Override
    public void run(){
        int count = 0;
        System.out.println("OLAAA! Son o Fio3");
        for (int i=1;i<=10;i++){
            if (i%10==2 || i%10==3){
               System.out.println("FIO 3 -- "+count+" + "+ i +" = "+(count= count+i)); 
            }
        }
        System.out.println("SUMA FINAL DEL HILO 3 = "+count);
    }
}
