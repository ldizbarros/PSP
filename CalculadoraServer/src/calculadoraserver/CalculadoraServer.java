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

        String cadenaRecibida="";
        
        while(true){
            //Se crea un stream que recibira los datos que envie el cliente
            InputStream input = newSocket.getInputStream();
            System.out.println("Conexión recibida");
            
            byte[] mensajeRe=new byte[20];
            int leer = input.read(mensajeRe);
                
            cadenaRecibida = new String(mensajeRe);
            
            //Si la cadena recivida empieza por un cero entonces se sale del bucle 
            //y se cierra el socket  
            char esCero = cadenaRecibida.charAt(0);
          
            if (esCero == '0'){
                break;
            }else{
                //Mostramos el mensaje
                System.out.println("Cadena recibida: "+cadenaRecibida);

                double resultado = 0,num1 = 0,num2 = 0;
                int operacion = 0;

                String [] cadena =cadenaRecibida.split(";");

                try{
                    //Se combierte el String recibido en los numeros para poder operar
                    //con ellos
                    operacion = Integer.valueOf(cadena[0]);
                    num1 = Integer.valueOf(cadena[1]);
                    num2 = Integer.valueOf(cadena[2]);
                }catch(NumberFormatException e2){
                    e2.getMessage();   
                }

                String mensaje="";
                
                //Se realiza la operacion 
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
                                resultado = (double) Math.sqrt(num1);
                                mensaje=String.valueOf(resultado);
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
            }
        }

        //Se cierra el socket que lee 
	System.out.println("Cerrando el nuevo socket");
	newSocket.close();

        //Se cierra el socket Servidor
	System.out.println("Cerrando el socket servidor");
        serverSocket.close();

	System.out.println("Terminado");
    }
    
}
