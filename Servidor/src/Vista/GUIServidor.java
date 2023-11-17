package Vista;

import javax.swing.*;

public class GUIServidor extends JFrame 
{
    JTabbedPane pestanas;   
    JPanel pCrear, pVisualizar, pInformes, pHacer;
    JScrollPane scVisualizar, scInforme;

    JLabel lCrearNombre, lCrearArchivo, lCrearDuracion, 
        lIniciarCantidad, lIniciarTiempo, lIniciarTiempoRestante, 
        lIniciarTimer, lIniciarPreguntas, lIniciarRespondidas, 
        lIniciarCliente1, lIniciarCliente2, lIniciarCliente3;

    JButton bCrearCargar, bCrearCrear, bVerVer, bVerLimpiar, 
        bInformeVer, bInformeLimpiar, bIniciarIniciar;

    JTextField tfCrearNombre;
    JTextArea taVisualizar, taInforme;
    JComboBox cbVisualizar, cbInforme, cbIniciar;
    JSpinner horas, minutos, segundos;

    /**
     * Constructor de la clase GUIServidor
     */
    public GUIServidor()
    {
        setTitle("Servidor");
        setSize(480, 560);
        crearGUI();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void crearGUI()
    {
        //Crear componentes
        pestanas = new JTabbedPane();

        pestanas.addTab("Crear examen",pCrear);
        pestanas.addTab("Visualizar examen",pVisualizar);
        pestanas.addTab("Ver informes",pInformes);
        pestanas.addTab("Realizar examen",pHacer);

        add(pestanas);
    }
}
