package socketserverej2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Cliente envia mensaje con lista de 5 numeros. Servidor calcula la suma y 
 * devuelve el resultado al cliente.
 * @author ldizbarros
 */
public class SocketServerEj2 {

    public static void main(String[] args) throws IOException {
        
        boolean reciviendo = false;
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
        InputStream input = newSocket.getInputStream();
        System.out.println("Conexión recibida");
            
        byte[] mensajeRe=new byte[20];
        int leer = input.read(mensajeRe);
                
        //Mostramos el mensaje
        System.out.println("Cadena recibida: "+new String(mensajeRe));
            
        String cadenaRecibida = new String(mensajeRe);
        String [] cadena =cadenaRecibida.split(" ");
        int suma = 0;
            
        for (int i=0; i<cadena.length-1;i++){
            String nu = cadena[i];
            int num = Integer.valueOf(nu);
            suma = suma + num;
        }
        System.out.println("La suma es : "+String.valueOf(suma));
            
        OutputStream output=newSocket.getOutputStream();
        String mensaje="La suma es : "+suma;
        output.write(mensaje.getBytes());
        System.out.println("Mensaje enviado");

        //Se cierra el socket que lee 
	System.out.println("Cerrando el nuevo socket");
	newSocket.close();

        //Se cierra el socket Servidor
	System.out.println("Cerrando el socket servidor");
        serverSocket.close();

	System.out.println("Terminado");
    }
    
}
