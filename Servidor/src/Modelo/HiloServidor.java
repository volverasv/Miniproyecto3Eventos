/* Angie Joya - 2322609
 * Emily Nuñez - 2240156
 * Sheila Valencia - 2243011
 * Victoria Volveras - 2241874
 */

package Modelo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloServidor extends Thread
{
    ObjectInputStream entrada;
    ObjectOutputStream salida;
    Socket socket;

    int idCliente;

    /**
     * Constructor de la clase HiloServidor
     * @param socket
     * @param id
     */
    public HiloServidor(Socket socket, int id)
    {
        this.socket = socket;
        this.idCliente = id;
    }

    @Override
    /**
     * Métdo que corre el hilo
     */
    public void run() 
    {
        
    }

    public void obtenerFlujos()
    {
        try {
            salida = new ObjectOutputStream(socket.getOutputStream());
            salida.flush();
            entrada = new ObjectInputStream(socket.getInputStream());
            System.out.println("Se obtuvieron los flujos correctamente");
        } catch (IOException e) {
            System.out.println("Error al obtener los flujos");
        }
    }

    public void procesarConexion()
    {
        
    }

}
