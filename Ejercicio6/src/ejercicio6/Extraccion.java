package ejercicio6;

public class Extraccion extends Thread{

    private Cuenta cuenta;
    private double extraccion;

    public Extraccion(Cuenta cuenta, double extraccion) {
        this.cuenta = cuenta;
        this.extraccion= extraccion;
    }
            
    @Override
    public void run(){
        double saldo = cuenta.getSaldo();
        cuenta.setSaldo(saldo-extraccion);
    }
    
}
