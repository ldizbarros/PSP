package ejercicio4;

/**
 * Realiza un programa en java que execute tres fíos de forma concurrente. 
 * Un de eles debe sumar os números pares del 1 ao 1000, outro os impares,
 * e outro, os que terminen en dous ou en tres.
 * @author laura
 */
public class Ejercicio4 {

    /**
     * No metodo main instancianse as clases dos fios e arrancanse os 3 fios.
     * No exercicio pide facer a suma do 1 ao 1000. Para controlar o correcto 
     * funcionamento do codigo, farase so do 1 o 10.
     * @param args 
     */
    public static void main(String[] args) {
        Fio1 f1 = new Fio1();
        Fio2 f2 = new Fio2();
        Fio3 f3 = new Fio3();
        
        f1.start();
        f2.start();
        f3.start();
    }
    
}
