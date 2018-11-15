package ejercicio5;

public class Fio  extends Thread{
    
    private int num;

    public Fio(int num) {
        this.num = num;
    }
    
    @Override
    public void run(){
        System.out.println("Ola, son o fío número "+num);         
    }
}
