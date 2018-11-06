package ejercicio1;

/**
 *Programa en java que cree dous fios e os executa.
 * Os fíos escriben dez veces un número de iteración do bucle e seu nome. 
 * En cada iteración, despois de escribir o seu nome, se bloquean 
 * durante un tempo aleatorio de segundos e después volven a estar 
 * dispoñibles para a súa execución.
 * @author laura
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Fio1 f1 = new Fio1();
        Fio2 f2 = new Fio2();
        
        f1.start();
        f2.start();
    }
    
}
