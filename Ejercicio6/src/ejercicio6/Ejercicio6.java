package ejercicio6;

/**
 * Simular a caixa dunha empresa con dous fíos. 
 * Un simulará o ingreso, ca compra de artigos por parte de clientes e o outro
 * a extracción de cartos da caixa co pago a proveedores. 
 * A conta terá un capital inicial. Realizar 10 ingresos e 5 extraccións.
 * 
 * @author ldizbarros
 */

public class Ejercicio6 {
    
    /**
     * En el metodo main se instancia la clase Cuenta y se muetra su saldo.
     * Creamos los hilos y los iniciamos para extraer y añadir dinero a la cuenta.
     * Hacemos un join de los dos hilos para asi comprobar el saldo de la cuenta
     * cuando los dos hilos ya hayan terminado.
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        
        Cuenta objCuenta = new Cuenta();
        
        System.out.println("Saldo inicial = "+objCuenta.getSaldo());
        
        Extraccion ext = new Extraccion(objCuenta,1);
        Introduccion intr = new Introduccion(objCuenta,1);
        
        ext.start();
        intr.start();
        
        System.out.println("Saldo que tendria que tener 955");
        ext.join();
        intr.join();
        System.out.println("Saldo final = "+objCuenta.getSaldo());
    }
    
}
