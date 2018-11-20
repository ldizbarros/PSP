package ejercicio6;

public class Introduccion extends Thread{
    
    private Cuenta cuenta;
    private double introduccion;

    public Introduccion(Cuenta cuenta, double introduccion) {
        this.cuenta = cuenta;
        this.introduccion= introduccion;
    }
            
    @Override
    public void run(){
        double saldo = cuenta.getSaldo();
        cuenta.setSaldo(saldo+introduccion);
    }
    
}
