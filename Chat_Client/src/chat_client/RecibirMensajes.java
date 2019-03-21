package chat_client;

import aplicacion.ChatRoom;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 * Hilo que se quedara escuchando por los mensajes nuevos del chat.
 * @author ldizbarros
 */
public class RecibirMensajes extends Thread{
    
    private static InputStream input;
    private static Socket socket;
    
    public RecibirMensajes(Socket socket,InputStream input) throws IOException{
        this.socket = socket;
        this.input = input;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                //Recibimos mensajes
                byte[] mensajeRe = new byte[250];
                input.read(mensajeRe);
                String mensaje = new String(mensajeRe);
                if (mensaje.contains(";")){
                    String [] cadena = mensaje.split(";");
                    MetodosChat.recibirMensaje(cadena[0]);
                    ChatRoom.lblNotificaciones.setText("Hay "+cadena[1]+" usuario/s conectado/s");
                }else{
                    System.out.println("Mensaje Recibido: "+mensaje);
                    MetodosChat.recibirMensaje(mensaje);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "El servidor se ha cerrado inesperadamente");
                try {
                    socket.close();
                } catch (IOException ex1) {
                    ex1.getMessage();
                }finally{
                    System.exit(0);
                }
            } 
        }
    }
}
