package socketservertcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Usando o porto 6666, conversacion de 3 mensajes por cada aplicacion.
 * @author ldizbarros
 */
public class SocketServerTCP {

    public static void main(String[] args) throws IOException {
        
        //Creamos el socket del servidor
        System.out.println("Creando socket servidor");
	ServerSocket serverSocket=new ServerSocket();
        
        //Hacemos que el socket del servidor escuche en la direcion deseada
        System.out.println("Realizando el bind");   
        InetSocketAddress addr=new InetSocketAddress("localhost",6666);
	serverSocket.bind(addr);

        //El socket del servidor se queda escuchando en la direccion deseada.
        //En cuenato reciba una conexion se crea el objeto Socket
	System.out.println("Aceptando conexiones");
        Socket newSocket= serverSocket.accept();

        //Se crea un stream que recibira los datos que envie el cliente
        System.out.println("Conexión recibida");
        InputStream input = newSocket.getInputStream();
        //OutoutStream os=newSocket.getOutputStream(); esto solo se necesita si se envian mensajes

        //Creamos una variable qu enos permitira visializar el mensaje.
        //Grabamos en esa variable lo que nos llega en el input
	byte[] mensaje=new byte[25];
	input.read(mensaje);

        //Mostramos el mensaje
	System.out.println("Mensaje recibido: "+new String(mensaje));

        //Se cierra el socket que lee 
	System.out.println("Cerrando el nuevo socket");
	newSocket.close();

        //Se cierra el socket Servidor
	System.out.println("Cerrando el socket servidor");
        serverSocket.close();

	System.out.println("Terminado");
    }
    
}
