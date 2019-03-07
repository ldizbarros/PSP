package calculadoraclient_v2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Clase con metodos que enlazaran el socket con la interfaz.
 * @author ldizbarros
 */
public class MetodosCalculadora {
 
    private static Socket clienteSocket;
    
    /**
     * Este metodo hace la conexion con el servidor 
     * @param ip ip del servidor
     * @param port puerto del servidor
     * @throws IOException 
     */
    public static void conexionSocket(String ip, String port) throws IOException{
        try{
            //Se crea el cocket del cliente
            clienteSocket=new Socket();
            //Se establece la conexion con el server	
            InetSocketAddress direccion=new InetSocketAddress(ip,Integer.parseInt(port));
            clienteSocket.connect(direccion);
            System.out.println("Conexion Establecida");
            JOptionPane.showMessageDialog(null, "Conexion establecida con éxito");
        }catch(ConnectException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion.\n No se ha podido conectar al servidor");
        }
    }
    
    /**
     * Este metodo crea el String y lo envia al servidor para realizar la operacion
     * @param operando tipo de operacion
     * @param num1 primer operado
     * @param num2 segundo operando
     * @throws IOException 
     */
    public static void operacion (int operando, int num1, int num2) throws IOException{
        String mensaje=null;
        try{
            OutputStream output=clienteSocket.getOutputStream();
            if (operando == 5) {
                mensaje = operando + ";" + num1+";";
                output.write(mensaje.getBytes());
                System.out.println("Operacion enviada");
            } else {
                mensaje = operando + ";" + num1 + ";" + num2+";";
                output.write(mensaje.getBytes());
                System.out.println("Operacion enviada");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se ha establecido la conexion con el servidor.");
        }
    }
    
    /**
     * Este metodo recibe el resultado del servidor 
     * @return duvuelve el resultado de la operacion
     * @throws IOException 
     */
    public static String recibirResultado() throws IOException{
        byte[] mensajeRe = new byte[50];
        try{
            InputStream input = clienteSocket.getInputStream();
            input.read(mensajeRe);
            System.out.println("Solucion recibida");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No se ha establecido la conexion con el servidor.");
        }
        return new String(mensajeRe);
    }
    
    /**
     * Se cierra el socket del cliente
     * @throws IOException 
     */
    public static void cerrarSocket() throws IOException{
        OutputStream output=clienteSocket.getOutputStream();
        String off = "off";
        output.write(off.getBytes());
        System.out.println("Mensaje de apagado enviado");
        clienteSocket.close();
    }
}
