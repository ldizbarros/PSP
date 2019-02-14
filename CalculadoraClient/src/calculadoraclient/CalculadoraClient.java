package calculadoraclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

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
public class CalculadoraClient {

    public static void main(String[] args) throws IOException {
        boolean reciviendo,correcto = false;
        //Se crea el cocket del cliente
        System.out.println("Creando socket cliente");
        Socket clienteSocket=new Socket();
        
        //Se establece la direccion del socket cliente
	System.out.println("Estableciendo la conexión");	
	InetSocketAddress direccion=new InetSocketAddress("localhost",6666);
	clienteSocket.connect(direccion);
       
        //ENVIAR
        Scanner sc = null;
        OutputStream output=clienteSocket.getOutputStream();
       
        int operacion=0;
        
        while(operacion==0 || operacion>5){
            try{
                sc = new Scanner(System.in);
                System.out.println("Introduzca el tipo de operacion a realizar:\n"
                         + "    1 - Suma\n"
                         + "    2 - Resta\n"
                         + "    3 - Multiplicacion\n"
                         + "    4 - Division\n"
                         + "    5 - Raiz\n");
                System.out.print("Introduce el numero de referencia --> ");
                operacion = sc.nextInt();
                if (operacion!=1 || operacion!=2 || operacion!=3 || operacion!=4 ||operacion!=5){
                    continue;
                }
            }catch(InputMismatchException e){
                System.out.println("Opcion introducida no válida");
            }   
        }

        if (operacion == 5) {
            System.out.print("Introduce el operando --> ");
            int num1 = sc.nextInt();
            String mensaje = operacion + ";" + num1+";";
            output.write(mensaje.getBytes());
        } else {
            System.out.print("Introduce el primer operando --> ");
            int num1 = sc.nextInt();
            System.out.print("Introduce el segundo operando --> ");
            int num2 = sc.nextInt();
            String mensaje = operacion + ";" + num1 + ";" + num2+";";
            output.write(mensaje.getBytes());
        }

        
        //RECIBIR
        InputStream input = clienteSocket.getInputStream();
        System.out.println("Conexión recibida");

        byte[] mensajeRe = new byte[20];
        int leer = input.read(mensajeRe);

        System.out.print("El resultado de la operacion es: ");
        System.out.println(new String(mensajeRe));
       
        if (leer == -1) {
            reciviendo = false;
        }

        //Cerramos el socket
        System.out.println("Cerrando el socket cliente");
	clienteSocket.close();

	System.out.println("Terminado");
    }
    
}
