package chat_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Práctica programación fíos: desenvolvemento de un chat con arquitectura cliente/servidor.
 * O obxectivo é desenvolver un sistema de chat cliente/servidor mediante sockets en TCP/IP.
 * O servidor:
 * 1. Permitirá conectar varios clientes de chat simultanemente, ata un máximo de 10. 
 * 2. Disporá dunha única sala de chat á que se conectarán todos os clientes.
 * 3. Cada usuario terá un nickname que se lle solicitará antes de establecer 
 * a conexión co servidor.
 * 4. Amosará por pantalla todas as mensaxes que se reciban desde os clientes 
 * a medida que van chegando, indicando "nickname: mensaxe..." 
 * 5. Cada mensaxe que se reciba será reenviado a todos os clientes, incluíndo 
 * o nickname correspondente.
 * 6. Ao arrancar o servidor, se solicitará o porto polo que se establecerá a conexión.
 * 7. Cada vez que se conecte un novo cliente, indicarase por pantalla:
 *      Novo cliente conectado (nickname / enderezo IP / porto )
 *      Actualmente hai x usuarios conectados.
 * 8. Mentras non se conecte ningún usuario, ou se todos os clientes se desconectan, 
 * amosarase a mensaxe "Ningún cliente conectado".
 * 9.Se o servidor é pechado, todos os clientes cerrarán adecuadamente as súas
 * conexións tras amosar a mensaxe "O servidor desconectouse".
 * @author ldizbarros
 */
public class ChatServer {

    /**
     * Creamos un Array que nos ayudara a controlar el numero de clientes conectados.
     */
    static ArrayList <Cliente> listaClientes = new ArrayList();

    public static void main(String[] args){
        //Pedimos el puerto del servidor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el PUERTO del servidor --> ");
        int puerto = sc.nextInt();
        
        try {
            //Creamos el socket del servidor
            ServerSocket serverSocket=new ServerSocket();
            InetSocketAddress addr=new InetSocketAddress("localhost",puerto);
            serverSocket.bind(addr);
             //El socket del servidor se queda escuchando en la direccion deseada.
            System.out.println("Socket Servidor creado");
            
            InputStream input;
            OutputStream output;
            
            while(true){
                //En cuenato reciba una conexion se crea el objeto Socket
                Socket newSocket= serverSocket.accept();
                if (listaClientes.size() <10) {
                    System.out.println("Aceptando conexiones");
                    input = newSocket.getInputStream();
                    output = newSocket.getOutputStream();
                    
                    if(listaClientes.size()==0){
                        System.out.println("No hay ningun usuario conectado");
                    }
                    
                    String aviso = "true";
                    output.write(aviso.getBytes());
                    System.out.println("Mensaje Enviado"); 

                    //Recibimos el nickname
                    byte[] nicknameRE = new byte[250];
                    input.read(nicknameRE);
                    String nickname = new String(nicknameRE);
                    System.out.println("Usuario solicita conexion:"+nickname);
                    //Se crea un hilo por cada conexion al server
                    
                    //Añadimos un nuevo cliente a la lista y lo iniciamos
                    Cliente nuevoCliente = new Cliente(newSocket,nickname,output,input);
                    nuevoCliente.start();
                    listaClientes.add(nuevoCliente);
                    
                    System.out.println(nickname+" se ha conectado (IP:"+newSocket.getLocalAddress()
                            +", PUERTO: "+newSocket.getLocalPort()+")");
                    System.out.println("Hay " + listaClientes.size() + " cliente/s conectados.");
                    
                    for (Cliente elemento: listaClientes) {
                        String conexionNueva = nickname+" se ha conectado al chat.\n;"+listaClientes.size()+";"; 
                        elemento.enviarMensaje(conexionNueva);
                    }
                }else{
                    System.out.println("Se ha alcanzado el maximo de usuarios permitidos.");
                    output = newSocket.getOutputStream();
                    String aviso = "false";
                    output.write(aviso.getBytes());
                    System.out.println("Mensaje Enviado"); 
                }
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido un error en la conexion.");
        }
    }
}
