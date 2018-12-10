package ejercicio9;

/**
 * Desenvolve un programa empregando fíos que simule o comportamento dun ascensor nun
 * edificio de 20 plantas. Cando alguén chama o ascensor desde un piso, irá a ese piso cando
 * poda (se está parado, vai nese intre, se está en marcha, só poderá ir cando teña rematado o
 * seu percorrido, xa sexa de subida ou de baixada). Para poder controlar este movemento,
 * precisamos coñecer cal é o piso no que se atopa o ascensor.
 * @author ldizbarros
 */
public class Ejercicio9 {

    /**
     * Clase main del programa.
     * Desde aqui creamos un objeto de la clase Ascensor y sus usuarios
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        
        Usuario usu1 = new Usuario(3,ascensor);
        Usuario usu2 = new Usuario(7,ascensor);
        
        usu1.start();
        usu2.start();
    }
    
}
