package chat_client;

import aplicacion.Login;

/**
 * Práctica programación fíos: desenvolvemento de un chat con arquitectura cliente/servidor.
 * O obxectivo é desenvolver un sistema de chat cliente/servidor mediante sockets en TCP/IP.
 * Os clientes:
 * 1. Ao arrancar solicitarase o enderezo IP e o porto de conexión do servidor. V
 * 2. A continuación solicitarase o nickname que se empregará para identificar 
 * as mensaxes do usuario, e se realizará a conexión co servidor. V
 * 3. Unha vez conectado, amosaranse as mensaxes recibidas na pantalla. X
 * 4. Se o usuario escribe unha mensaxe, será enviada ao servidor para o 
 * seu reenvío a todos os demáis clientes. X
 * 5. O cliente admitirá un comando /bye que fará que se peche a conexión co servidor e saia do programa. V
 * 6. Cada vez que un novo cliente se conecta:   
 *      no cliente aparecerá unha mensaxe indicando "Conectado á sala de chat" X 
 *      amosarase a todos os participantes a mensaxe "nickname acaba de conectarse a este chat." X
 * 7. Cada vez que un novo cliente se desconecta, amosarase a todos os 
 * participantes a mensaxe "nickname deixou este chat." X
 * 8. Cada vez que se escribe unha mensaxe, a todos os clientes se lles amosará 
 * a mensaxe co formato "nickname: mensaxe" X
 * 
 * @author ldizbarros
 */
public class Chat_Client {

    public static void main(String[] args) {
        Login ventanaPrincipal = new Login();
        ventanaPrincipal.setVisible(true);
    }
    
}
