package ejercicio4;

public class Fio2 extends Thread{
     
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
