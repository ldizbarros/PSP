package ejercicio5;

/**
 * Escribe unha clase que cree dous fíos e force que a escritura do segundo 
 * sexa sempre anterior á escritura por pantalla do primeiro.
 * Exemplo de ejecución:
 *      Ola, son o fío número 2
 *      Ola, son o fío número 1
 * a) faino con join
 * b )faino con prioridades
 * @author laura
 */
public class Ejercicio5 {

    public static void main(String[] args) throws InterruptedException {
        
        //VERSION A
        Fio f1 = new Fio(1);
        Fio f2 = new Fio(2);
        
        f2.start();
        f2.join();
        f1.start();
        
        //VERSION B
        //Con prioridades el procesador es el que decide asi que puede que no le
        //haga caso a las prioridades que le doy
        Fio f3 = new Fio(1);
        Fio f4 = new Fio(2);
        
        f3.setPriority(10);
        f4.setPriority(1);
        
        f3.start();
        f4.start();
    }
    
}
