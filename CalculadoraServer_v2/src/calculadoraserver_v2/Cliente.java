package calculadoraserver_v2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Clase hilo que realiza las operaciones para cada cliente
 * @author ldizbarros
 */
public class Cliente extends Thread{
     
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    
    public Cliente(Socket socket) throws IOException{
        this.socket=socket; 
        input = socket.getInputStream();
        output = socket.getOutputStream();
    }
    
    @Override
    public void run(){
        while (true) {
            try{
                byte[] mensajeRe=new byte[50];
                //Se crea un stream que recibira los datos que envie el cliente
                System.out.println("Conexión recibida");
                input.read(mensajeRe);
                //Mostramos el mensaje
                String mensajeRecibido = new String(mensajeRe);
                if (mensajeRecibido.contains("off")){
                    //Cerramos la conexión
                    socket.close();
                    System.out.println("Socket Cerrado");
                    break;
                }else{
                    System.out.println("Cadena recibida: "+ mensajeRecibido);
                    double resultado = 0,num1 = 0,num2 = 0;
                    int operacion = 0;
                    String [] cadena =mensajeRecibido.split(";");
                    try{
                        //Parseamos la cadena recibida
                        operacion = Integer.valueOf(cadena[0]);
                        num1 = Integer.valueOf(cadena[1]);
                        num2 = Integer.valueOf(cadena[2]);
                    }catch(NumberFormatException e2){
                        System.out.println("Se ha producido un error en la conversion de los datos");
                    }
                    String mensaje="";
                    //Hacemos las operaciones y elaborames el mensaje/resultado de la respuesta
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
                    output.write(mensaje.getBytes());
                    System.out.println("Mensaje enviado");
                }
            }catch(IOException ex){
                System.out.println("Se ha producido un error en la conexion");
                break;
            }
        } 
    }
}
