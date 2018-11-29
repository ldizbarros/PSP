package ejercicio7;

/**
 * Programa que simule un buzón de correo (recurso compartido), 
 * de xeito que se poida leer unha mensaje ou envialo. 
 * O buzón soamente pode almacear unha mensaxe, de xeito que para poder 
 * escribir débese atopar baleiro e para poder leer debe de estar cheo. 
 * Crear varios fíos lectores e escritores que manexen o buzón
 * de xeito sincronizado.
 * 
 * @author ldizbarros
 */
public class Ejercicio7 {

    /**
     * Metodo main donde se crea el buzon compartido y los distintos
     * hilos de lectura y escritura.
     * @param args 
     */
    public static void main(String[] args) {
        
        Buzon buzon = new Buzon();
        
        Escribir esc = new Escribir("Hola caracola",buzon);
        Leer leer = new Leer(buzon);
        
        Escribir esc2 = new Escribir("Hola caracola 2",buzon);
        Leer leer2 = new Leer(buzon);
        
        Escribir esc3 = new Escribir("Hola caracola 3",buzon);
        Leer leer3 = new Leer(buzon);
        
        esc.start();
        leer.start();
        esc2.start();
        leer2.start();
        esc3.start();
        leer3.start();
    }
    
}
