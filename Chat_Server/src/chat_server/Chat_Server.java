package chat_server;

/**
 * Práctica programación fíos: desenvolvemento de un chat con arquitectura cliente/servidor.
 * O obxectivo é desenvolver un sistema de chat cliente/servidor mediante sockets en TCP/IP.
 * O servidor:
 * 1. Permitirá conectar varios clientes de chat simultanemente, ata un máximo de 10. 
 * 2. Disporá dunha única sala de chat á que se conectarán todos os clientes.
 * 3. Cada usuario terá un nickname que se lle solicitará antes de establecer 
 * a conexión co servidor.
 * 4. Amosará por pantalla todas as mensaxes que se reciban desde os clientes 
 * a medida que van chegando, indicando "nickname: mensaxe..." 
 * 5. Cada mensaxe que se reciba será reenviado a todos os clientes, incluíndo 
 * o nickname correspondente.
 * 6. Ao arrancar o servidor, se solicitará o porto polo que se establecerá a conexión.
 * 7. Cada vez que se conecte un novo cliente, indicarase por pantalla:
 *      Novo cliente conectado (nickname / enderezo IP / porto )
 *      Actualmente hai x usuarios conectados.
 * 8. Mentras non se conecte ningún usuario, ou se todos os clientes se desconectan, 
 * amosarase a mensaxe "Ningún cliente conectado".
 * 9.Se o servidor é pechado, todos os clientes cerrarán adecuadamente as súas
 * conexións tras amosar a mensaxe "O servidor desconectouse".
 * @author ldizbarros
 */
public class Chat_Server {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
