package ejercicio4;

public class Fio2 extends Thread{
    
    /**
     * Este metodo sobrescribe o metodo run() da clase Thread.
     * Este metodo indica que comeza o Fio2. Logo ten un bucle onde se suman 
     * os numeros impares dos primerios 10 numeros enteiros.
     * Antes de rematar o fio mostra a suma de todos os numeros impares.
     */
    @Override
    public void run(){
        int count = 0;
        System.out.println("OLAAA! Son o Fio2");
        for (int i=1;i<=10;i++){
            if (i%2 != 0){
               System.out.println("FIO 2 -- "+count+" + "+ i +" = "+(count= count+i)); 
            }
        }
        System.out.println("SUMA FINAL DEL HILO 2 = "+count);
    }
}
