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

    public static void main(String[] args) {
        
        Cuenta objCuenta = new Cuenta();
        
        System.out.println(objCuenta.toString());
        
        synchronized (objCuenta) {
            for (int i=1;i<=10;i++){
                if (i<=5){
                    Extraccion ext = new Extraccion(objCuenta,1);
                    ext.start();
                    Introduccion intr = new Introduccion(objCuenta,1);
                    intr.start();
                }else{
                    Introduccion intr = new Introduccion(objCuenta,1);
                    intr.start(); 
                }
            }
        }
        
        System.out.println("Saldo que tendria que tener 955");
        System.out.println(objCuenta.toString());
    }
    
}
