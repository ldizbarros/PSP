package exemplo1;

/**
 * Crea un fio que realice o calculo dos primeiros N numeros da sucesion de Fibonacci.
 * A sucesion de Fibonacci comenza cos numeros 1 e 1 e o seguinte elemento e a suma
 * dos dous elementos anteriores. Asi a sucesion de Fibonaci seria 1,1,2,3,5,8,11,19,30,49...
 * O parametro N sera indicado cando se chame ao constructor da clase Thread correspondente.
 * @author laura
 */

public class Exemplo1 {

    public static void main(String[] args) {
        
        new Fio(6).start();
        new Fio2(6).start();  
    }
    
}
