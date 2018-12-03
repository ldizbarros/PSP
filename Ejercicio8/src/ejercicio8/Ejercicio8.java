package ejercicio8;

/**
 * Implementa unha simulación da fabula que conta a carreira entre a lebre e a tartaruga.
 * Para facelo máis interesante a carreira será costa arriba por unha pista esvaradía, de modo
 * que ás veces poderán escorregar e retroceder algunhas posicións. Haberá un thread que
 * implementará a tartaruga e outro a lebre. Cada un suspenderase durante un segundo e
 * logo avaliará o que pasou segundo unhas probabilidades:
 * Tartaruga
 *  Suceso              Probalidade     Movemento
 *   Avance rápido       50%             3 casiñas á dereita
 *   Esvarou             20%             6 casiñas á esquerda
 *   Avance lento        30%             1 casiña á dereita
 * Lebre
 *  Suceso              Probalidade     Movemento
 *   Dorme               20%             
 *   Gran salto          20%             9 casiñas á dereita
 *   Esvarón grande      10%             12 casiñas á esquerda
 *   Pequeno salto       30%             1 casiña á dereita
 *   Esvarón pequeno     20%             2 casiñas á esquerda
 * 
 * Calcule a probabilidade con random, de 1 a 100 e determine co devandito número que fixo
 * cada animal. Considere que hai 70 casiñas, da 1 á 70, a 1 de saída e a 70 de chegada.
 * Se escorrega ao principio volve á 1, nunca por baixo. Tras cada segundo e
 * despois de calcular a súa nova posición imprima unha liña por cada animal, ca posición e logo
 * unha letra T para a tartaruga e unha L para a lebre. Imprima ao
 * comeza da carreira unha mensaxe. Despois de imprimir as liñas determine se algún chegou
 * a meta e gañou, imprimindo unha mensaxe. Se ambos chegan á vez declare un empate.
 * @author ldizbarros
 */
public class Ejercicio8 {

    /**
     * Clase main. En el main creamos objetos de la clase carrera, la clase liebre y la
     * clase tortuga y luego inicioamos la carrera empezando los hilos que
     * son la tortuga y la liebre.
     * @param args 
     */
    public static void main(String[] args) {
        
        Carrera carrera = new Carrera();
        
        Tortuga tortuga = new Tortuga(carrera);
        Liebre liebre = new Liebre(carrera);
        
        tortuga.start();
        liebre.start();
    }
    
}
