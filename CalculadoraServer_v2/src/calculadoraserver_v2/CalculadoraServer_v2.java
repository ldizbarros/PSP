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

    public static void main(String[] args) {
        //Pedimos el puerto del servidor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el PUERTO del servidor --> ");
        int puerto = sc.nextInt();
        
        try {
            //Creamos el socket del servidor
            ServerSocket serverSocket=new ServerSocket();
            InetSocketAddress addr=new InetSocketAddress("localhost",puerto);
            serverSocket.bind(addr);
            System.out.println("Socket Servidor creado");
            
            while(true){
                //El socket del servidor se queda escuchando en la direccion deseada.
                //En cuenato reciba una conexion se crea el objeto Socket
                System.out.println("Aceptando conexiones");
                Socket newSocket= serverSocket.accept();
            
                //Se crea un hilo por cada conexion al server
                new Cliente(newSocket).start();  
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido un error en la conexion.");
        }
    } 
}
