package ejercicio2;

/**
 * Programa que crea 4 fíos, os executa e espera a que estes terminen. 
 * Os fíos escriben 5 veces o número de iteración do bucle e o seu nome. 
 * En cada iteración, despois de escribir o seu nome, bloquéanse durante un 
 * segundo e volven a estar dispoñibles para a súa execución.
 * @author laura
 */
public class Ejercicio2 {

    /**
     * No metodo main instancianse a clase dos fios e arrancanse os 4 fios.
     * @param args 
     */
    public static void main(String[] args) {
        
        Fio1 f1 = new Fio1();
        Fio2 f2 = new Fio2();
        Fio3 f3 = new Fio3();
        Fio4 f4 = new Fio4();
        
        f1.start();
        f2.start();
        f3.start();
        f4.start();
    }
    
}
