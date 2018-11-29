package ejercicio6;

/**
 * Clase Cuenta.
 * @author ldizbarros
 */
public class Cuenta {
    
    private double saldo = 950;
    private boolean ingresando=false,retirando=false;

    /**
     * Constructor da Clase 
     */
    public Cuenta() {
    }

    /**
     * Geter da clase Conta
     * @return devolve o valor da variable saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Seter da clase Cuenta
     * @param saldo pasaselle o novo valor do saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo toString
     * @return devolve o string indicado
     */
    @Override
    public String toString() {
        return "Saldo de la cuenta = "+saldo;
    }
    
    /**
     * Metodo sincronizado que aumenta o valor do saldo
     * @param cantidad cantidade a aumentar o saldo
     * Este metodo comprueba que en el momento de ejecutarse no se esta haciendo 
     * ninguna retirada. Si se esta haciendo una retirada espera si no procede a
     * hacer el ingreso y al terminar indica que ha terminado (notify) 
     */
    public synchronized void ingresarSaldo(double cantidad) throws InterruptedException {
        ingresando = true;
        if (retirando==true){
            wait();
        }
        saldo = saldo + cantidad;
        ingresando=false;
        notify();
    }
    
    /**
     * Metodo sincronizado que reduce o valor do saldo
     * @param cantidad cantidade a retirar do saldo
     * Este metodo comprueba que en el momento de ejecutarse no se esta haciendo 
     * ningun ingreso. Si se esta haciendo un ingreso espera si no continia el programa.
     * Despues se coprueba que la cuenta no esta a cero si lo esta espera a que 
     * se haga un ingreso si no sigue con el programa.
     * Por ultimo se comprueba que la cantidad a retirar es menos que el saldo si lo es
     * se puede hacer el ingreso y al terminar indica que ha terminado (notify) 
     * si no lo es no realiza ningun ingreso.
     */
    public synchronized void retirarSaldo(double cantidad) throws InterruptedException{
        retirando=true;
        if (ingresando==true){
            wait();
        }
        if (saldo==0){
            System.out.println("saldo a 0 espere...");
            wait();
        }
        if (cantidad<saldo){
            saldo=saldo-cantidad;
            retirando=false;
            notify();
        }
    }
}
