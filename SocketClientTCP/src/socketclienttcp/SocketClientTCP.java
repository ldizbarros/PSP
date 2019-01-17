package socketclienttcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Usando o porto 6666, conversacion de 3 mensajes por cada aplicacion.
 * @author ldizbarros
 */
public class SocketClientTCP {

    public static void main(String[] args) throws IOException {
        
        boolean reciviendo = false;
        //Se crea el cocket del cliente
        System.out.println("Creando socket cliente");
        Socket clienteSocket=new Socket();
        
        //Se establece la direccion del socket cliente
	System.out.println("Estableciendo la conexión");	
	InetSocketAddress direccion=new InetSocketAddress("localhost",6666);
	clienteSocket.connect(direccion);
        int count=0;

        reciviendo=true;
        while (reciviendo==true){
             count++;
            //Se crea un stream que recibira los datos que envie el cliente
            System.out.println("Conexión recibida");
            InputStream input = clienteSocket.getInputStream();
            OutputStream output=clienteSocket.getOutputStream();
            
            if (count>3){
                reciviendo=false;
            }else{
                String mensaje="Mensaje numero "+count;
                output.write(mensaje.getBytes());
                System.out.println("Mensaje "+count+" enviado");
            
                //Creamos una variable qu enos permitira visializar el mensaje.
                //Grabamos en esa variable lo que nos llega en el input
                byte[] mensajeRe=new byte[20];
                int leer = input.read(mensajeRe);
                
                //Mostramos el mensaje
                System.out.println("Mensaje recibido: "+new String(mensaje));
            }
        }

        //Cerramos el socket
        System.out.println("Cerrando el socket cliente");
	clienteSocket.close();

	System.out.println("Terminado");
    }
    
}
