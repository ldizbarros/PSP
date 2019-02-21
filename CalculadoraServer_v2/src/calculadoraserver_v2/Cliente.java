package calculadoraserver_v2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente extends Thread{
    
    public Cliente(Socket socket) throws IOException{
        //Se crea un stream que recibira los datos que envie el cliente
        InputStream input = socket.getInputStream();
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
            
        OutputStream output=socket.getOutputStream();
        output.write(mensaje.getBytes());
        System.out.println("Mensaje enviado");
        
        //Se cierra el socket que lee 
	System.out.println("Cerrando el nuevo socket");
	socket.close();
    }
    
}
