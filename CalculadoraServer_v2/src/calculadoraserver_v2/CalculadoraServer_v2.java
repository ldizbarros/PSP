package calculadoraserver_v2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**Ampliar a funcionalidade da calculadora cliente - servidor v1.0, para permitir:
 * 
 * 1. Un servidor de cálculo e n clientes.
 * 
 * 2. Permitir configurar (mediante argumentos en liña de comandos, 
 * ficheiro de texto, variables na interfaz de usuario,...) :
 *      No Servidor: o número de porto
 *      No cliente:
 *          O enderezo IP do servidor
 *          O porto do servidor
 * 
 * 3. Intefaz grafica para o cliente.
 * @author ldizbarros
 */
public class CalculadoraServer_v2 {

    public static void main(String[] args) throws IOException {
        boolean reciviendo = false;
        //Creamos el socket del servidor
        System.out.println("Creando socket servidor");
	ServerSocket serverSocket=new ServerSocket();
        
        //Hacemos que el socket del servidor escuche en la direcion deseada
        System.out.println("Realizando el bind");   
        
        //Pedimos el puerto del servidor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el PUERTO del servidor --> ");
        int puerto = sc.nextInt();
        
        InetSocketAddress addr=new InetSocketAddress("localhost",puerto);
	serverSocket.bind(addr);
        
        while(true){
            //El socket del servidor se queda escuchando en la direccion deseada.
            //En cuenato reciba una conexion se crea el objeto Socket
            System.out.println("Aceptando conexiones");
            Socket newSocket= serverSocket.accept();
            
            new Cliente(newSocket).run();  
        }
        
        //Se cierra el socket Servidor
//	System.out.println("Cerrando el socket servidor");
//        serverSocket.close();
//
//	System.out.println("Terminado");
    }
    
}
