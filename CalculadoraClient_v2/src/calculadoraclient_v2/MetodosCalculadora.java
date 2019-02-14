package calculadoraclient_v2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Clase con metodos que enlazaran el socket con la interfaz.
 * @author ldizbarros
 */
public class MetodosCalculadora {
    
    private static Socket clienteSocket;
    
    public static void operacion (int operando, int num1, int num2) throws IOException{
        String mensaje=null;
        OutputStream output=clienteSocket.getOutputStream();
        if (operando == 5) {
            mensaje = operando + ";" + num1+";";
            output.write(mensaje.getBytes());
        } else {
            mensaje = operando + ";" + num1 + ";" + num2+";";
            output.write(mensaje.getBytes());
        }
    }
    
    public static void conexionSocket(String ip, String port) throws IOException{
        //Se crea el cocket del cliente
        System.out.println("Creando socket cliente");
        clienteSocket=new Socket();
        
        //Se establece la direccion del socket cliente
	System.out.println("Estableciendo la conexión");	
	InetSocketAddress direccion=new InetSocketAddress(ip,Integer.parseInt(port));
	clienteSocket.connect(direccion);
    }
    
    public static String recibirResultado() throws IOException{
        boolean reciviendo= false;
        InputStream input = clienteSocket.getInputStream();
        System.out.println("Conexión recibida");

        byte[] mensajeRe = new byte[20];
        int leer = input.read(mensajeRe);

        if (leer == -1) {
            reciviendo = false;
        }
        
        return new String(mensajeRe);
    }
    
    public static void cerrarSocket() throws IOException{
        clienteSocket.close();
    }
}
