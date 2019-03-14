package chat_client;

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
                System.out.println("Mensaje Recibido: "+mensaje);
                MetodosChat.recibirMensaje(mensaje);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Se ha producido un error al recibir el mensaje");
            }
        }
    }
}
