package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GUIServidor extends JFrame 
{
    JTabbedPane pestanas;    
    JPanel pCrear, pVisualizar, pInformes, pHacer;

    public GUIServidor()
    {
        setTitle("Servidor");
        setSize(500, 560);
        crearGUI();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void crearGUI()
    {
        pestanas = new JTabbedPane();

        pestanas.addTab("Crear examen",pCrear);
        pestanas.addTab("Visualizar examen",pVisualizar);
        pestanas.addTab("Ver informes",pInformes);
        pestanas.addTab("Realizar examen",pHacer);
    }
}
