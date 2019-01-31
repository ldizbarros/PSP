package calculadoraserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Programar unha calculadora cliente - servidor, na que:
 * 
 * 1. O cliente solicita unha serie de operacións posibles ao servidor, a saber:
 * suma n1 n2
 * resta n1 n2
 * multiplica n1 n2
 * divide n1 n2
 * raizq n1     (raíz cuadrada)
 * Para cada operación, se controlarán os erros posibles (división por cero, 
 * raíz cuadrada de números negativos, ...)
 * 
 * 2. O servidor realiza o cálculo solicitado e devolve o resultado ao cliente.
 * 
 * 3. O cliente recibe o resultado e o amosa por pantalla.
 * @author ldizbarros
 */
public class CalculadoraServer {

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

        int resultado = 0,operacion = 0,num1 = 0,num2 = 0;
        String cadenaRecibida = new String(mensajeRe);
        String [] cadena =cadenaRecibida.split(",");
        
        try{
            operacion = Integer.valueOf(cadena[0]);
            num1 = Integer.valueOf(cadena[1]);
            num2 = Integer.valueOf(cadena[2]);
        }catch(NumberFormatException e2){
            e2.getMessage();   
        }
        
        switch(operacion){
            case 1:
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                resultado = num1/num2;
                break;
            case 5:
                resultado = (int) Math.sqrt(num1);
                break;
            default:
                System.out.println("Se ha producido un error en la operacion recibida");
        }
        
        System.out.println("El resultado es: "+String.valueOf(resultado));
            
        OutputStream output=newSocket.getOutputStream();
        String mensaje=String.valueOf(resultado);
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
