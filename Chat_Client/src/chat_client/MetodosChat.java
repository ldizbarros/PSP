package chat_client;

import aplicacion.ChatRoom;
import aplicacion.Login;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Clase con metodos que enlazan la aplicacion con la logica del programa
 * @author ldizbarros
 */
public class MetodosChat {
    
    private static Socket clienteSocket;
    private static OutputStream output;
    private static InputStream input;
    private ChatRoom ventana;
    
    /**
     * Este metodo hace la conexion con el servidor.
     * Crea el socket cliente y envia el nick del usuario
     * @param ip ip del servidor
     * @param port puerto del servidor
     * @throws IOException 
     */
    public static void conexionSocket(String ip, String port, String nickname, Login login) throws IOException{
        try{
            //Se crea el cocket del cliente
            clienteSocket=new Socket();
            //Se establece la conexion con el server	
            InetSocketAddress direccion=new InetSocketAddress(ip,Integer.parseInt(port));
            clienteSocket.connect(direccion);
            System.out.println("Conexion Establecida con el servidor");
            login.setVisible(false);
            ChatRoom ventanaChat= new  ChatRoom();
            ventanaChat.setVisible(true);
            
            output = clienteSocket.getOutputStream();
            input = clienteSocket.getInputStream();
            
            output.write(nickname.getBytes());
            
            //Iniciamos hilo para recibir mensajes
            System.out.println("Empezamos Hilo.");
            new RecibirMensajes(clienteSocket,input).start();
        }catch(ConnectException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion.\n No se ha podido conectar al servidor");
        }
    }
    
    /**
     * Metodo que envia el mensaje al servidor.
     * Si el mensaje es /bye llama a la funcion de cerrar socket
     * @param mensaje mensaje a enviar
     */
    public static void enviarMensaje(String mensaje){
        try {
            if (mensaje.contains("/bye")){
                MetodosChat.cerrarSocket();
            }else{
                String enviar = mensaje+"\n";
                output.write(enviar.getBytes());
                System.out.println("Mensaje Enviado"); 
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Se ha producido un error al enviar el mensaje");
        }
    }
    
    /**
     * Hace el mensaje recibido visible en la aplicacion
     * @param mensaje mensaje recibido del servidor
     */
    public static void recibirMensaje(String mensaje){
        ChatRoom.txtChat.setText(ChatRoom.txtChat.getText()+mensaje);
    }
    
     /**
     * Se cierra el socket del cliente
     * @throws IOException 
     */
    public static void cerrarSocket() throws IOException{
        String off = "/bye";
        output.write(off.getBytes());
        System.out.println("Mensaje de apagado enviado");
        clienteSocket.close();
        System.exit(0);
    }
}
