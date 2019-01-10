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
        //Se crea el cocket del cliente
        System.out.println("Creando socket cliente");
        Socket clienteSocket=new Socket();
        
        //Se establece la direccion del socket cliente
	System.out.println("Estableciendo la conexión");	
	InetSocketAddress direccion=new InetSocketAddress("localhost",6666);
	clienteSocket.connect(direccion);

	//InputStream is = clientSocket.getInputStream(); esto solo no necesitamos si recibimos datos
	OutputStream output = clienteSocket.getOutputStream();

        //Enviamos el mensaje
	System.out.println("Enviando mensaje");
	String mensaje="mensaje desde el cliente";
	output.write(mensaje.getBytes());
	System.out.println("Mensaje enviado");

        //Cerramos el socket
        System.out.println("Cerrando el socket cliente");
	clienteSocket.close();

	System.out.println("Terminado");
    }
    
}
