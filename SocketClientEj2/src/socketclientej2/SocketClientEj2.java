package socketclientej2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Cliente envia mensaje con lista de 5 numeros. Servidor calcula la suma y 
 * devuelve el resultado al cliente.
 * @author ldizbarros
 */
public class SocketClientEj2 {

    public static void main(String[] args) throws IOException {
        boolean reciviendo = false;
        //Se crea el cocket del cliente
        System.out.println("Creando socket cliente");
        Socket clienteSocket=new Socket();
        
        //Se establece la direccion del socket cliente
	System.out.println("Estableciendo la conexión");	
	InetSocketAddress direccion=new InetSocketAddress("localhost",6666);
	clienteSocket.connect(direccion);
       
        OutputStream output=clienteSocket.getOutputStream();
        String mensaje="1 1 1 1 1";
        output.write(mensaje.getBytes());
        
        reciviendo=true;
        while (reciviendo==true){
            InputStream input = clienteSocket.getInputStream();
            System.out.println("Conexión recibida");
            
            byte[] mensajeRe=new byte[20];
            int leer = input.read(mensajeRe);
            System.out.println(new String(mensajeRe));

            if (leer==-1){
                reciviendo=false;
            }
        }

        //Cerramos el socket
        System.out.println("Cerrando el socket cliente");
	clienteSocket.close();

	System.out.println("Terminado");
    }
    
}
