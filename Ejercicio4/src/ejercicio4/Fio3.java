package ejercicio4;

public class Fio3 extends Thread{
     
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
