package calculadoraserver_v2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

        double resultado = 0,num1 = 0,num2 = 0;
        int operacion = 0;
        String cadenaRecibida = new String(mensajeRe);
        String [] cadena =cadenaRecibida.split(";");
        
        try{
            operacion = Integer.valueOf(cadena[0]);
            num1 = Integer.valueOf(cadena[1]);
            num2 = Integer.valueOf(cadena[2]);
        }catch(NumberFormatException e2){
            e2.getMessage();   
        }
        
        String mensaje="";
        
        try{   
            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    mensaje=String.valueOf(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    mensaje=String.valueOf(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    mensaje=String.valueOf(resultado);
                    break;
                case 4:
                    resultado= num1 / num2;
                    mensaje=String.valueOf(resultado);
                    break;
                case 5:
                    if (num1>0){
                        resultado = (int) Math.sqrt(num1);
                    }else{
                        mensaje="Error!";
                    }
                    break;
                default:
                    System.out.println("Se ha producido un error en la operacion recibida");
                    mensaje="Se ha producido un error en la operacion recibida";
            }
        }catch(ArithmeticException ex){
            System.out.println("La operacion introducida no es posible realizarla");
            mensaje="La operacion introducida no es posible realizarla";
        }
        
        System.out.println("El resultado es: "+String.valueOf(resultado));
            
        OutputStream output=newSocket.getOutputStream();
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
