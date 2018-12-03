package ejercicio7;

/**
 * Clase Buzon
 * @author ldizbarros
 */
public class Buzon {
   
    private String mensaje="";
    private boolean leyendo=false,escribiendo=false,vacio=true;

    /**
     * Constructor vacio de la clase Buzon.
     */
    public Buzon() {
    }

    /**
     * Constructor que le da valor a la variable mensaje de la clase Buzon.
     */
    public Buzon(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Getter de la clase Buzon
     * @return devuelve el mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Setter de la clase Buzon.
     * @param mensaje se le pasa el nuevo mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    /**
     * Metodo sincronizado que escribe un mensaje en el Buzon
     * @param mensaje nuevo mensaje a escribir
     * @throws InterruptedException 
     * Primero combrueba si se esta leyendo. Si esta leyendo se espera, si no
     * se comprueba si hay algun mensaje. Si lo hay espera a que no lo haya.
     * Por ultimo compruba si esta vacio. Si lo esta escribe el mensaje y avisa
     * de que acabo de escribir.
     */
    public synchronized void escribirMensaje(String mensaje) throws InterruptedException{
        
        if (leyendo==true){
            System.out.println("Esta leyendo. Esperando para escribir...");
            wait();
        }
        if (vacio==false){
            System.out.println("Esta lleno el buzon. Esperando para escribir...");
            wait();
        }
        escribiendo=true;
        this.mensaje = mensaje;
        System.out.println("MENSAJE ESCRITO");
        vacio=false;
        escribiendo=false;
        notify();
    }
    
    /**
     * Metodo sincronizado que lee el mensaje del Buzon
     * @throws InterruptedException 
     * Primero combrueba si se esta escribiendo. Si esta escribiendo se espera, si no
     * se comprueba si hay algun mensaje. Si no lo hay espera a que lo haya.
     * Por ultimo lee el mensaje y lo elimina y avisa que ha terminado de leer.
     */
    public synchronized void leerMensaje() throws InterruptedException{
       
        if (escribiendo==true){
            System.out.println("Esta escribiendo. Esperando para leer...");
            wait();
        }
        if (vacio==true){
            System.out.println("Esta vacio el mensaje. Esperando para leer...");
            wait();
        }
         leyendo=true;
        System.out.println("MENSAJE --> "+mensaje);
        this.mensaje="";
        vacio = true;
        leyendo=false;
        notify();
    }
}
