package ejercicio4;

public class Fio1 extends Thread{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo indica que comeza o Fio1. Logo ten un bucle onde se suman 
     * os numeros pares dos primerios 10 numeros enteiros.
     * Antes de rematar o fio mostra a suma de todos os numeros pares.
     */
    @Override
    public void run(){
        int count = 0;
        System.out.println("OLAAA! Son o Fio1");
        for (int i=1;i<=10;i++){
            if (i%2 == 0){
               System.out.println("FIO 1 -- "+count+" + "+ i +" = "+(count= count+i)); 
            } 
        }
        System.out.println("SUMA FINAL DEL HILO 1 = "+count);
    }
}
