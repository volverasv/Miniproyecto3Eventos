/* Angie Joya - 2322609
 * Emily Nuñez - 2240156
 * Sheila Valencia - 2243011
 * Victoria Volveras - 2241874
 */
package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que lee un archivo de texto y guarda la información en un arreglo de String 
 */
public class Archivo 
{
    private File archivo;
    private ArrayList<String> preguntas;

    public Archivo()
    {
        this.preguntas = new ArrayList<String>();
        cargarArchivo();
        generarPreguntas();
        //imprimirPregunta();
    }

    /**
     * Método que carga el archivo de texto que se utilizará
     */
    public void cargarArchivo()
    {
        String location = "src"+File.separator+"Archivos"+File.separator+"Preguntas2.txt";
        this.archivo = new File(location);
        System.out.println("Archivo cargado correctamente");
    }

    /**
     * Método que escanea un archivo,
     * lee el texto separado por un delimitador, 
     * y lo guarda en un arreglo
     */
    public void generarPreguntas()
    {
        try {
            Scanner buscador = new Scanner(this.archivo);
            /*buscador.useDelimiter("}");
            while(buscador.hasNext())
            {
                preguntas.add(buscador.next().trim());
                buscador.nextLine();
            }*/
            buscador.close();
            System.out.println("Se establecieron las preguntas correctamente");                 
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo");
        }
    }

    public void imprimirPregunta()
    {
        System.out.println("La primera pregunta es:\n"+preguntas.get(0));
    }
    
}
