package calculadoraclient_v2;

import aplicacion.Calculadora;

/**Ampliar a funcionalidade da calculadora cliente - servidor v1.0, para permitir:
 * 
 * 1. Un servidor de cálculo e n clientes.
 * 
 * 2. Permitir configurar (mediante argumentos en liña de comandos, 
 * ficheiro de texto, variables na interfaz de usuario,...) :
 *      No Servidor: o número de porto
 *      No cliente:
 *          O enderezo IP do servidor
 *          O porto do servidor
 * 
 * 3. Intefaz grafica para o cliente.
 * @author ldizbarros
 */
public class CalculadoraClient_v2 {

    public static void main(String[] args) {
        
        Calculadora ventanaPrincipal = new Calculadora();
        ventanaPrincipal.setVisible(true);
        
    }
    
}
