/* Angie Joya - 2322609
 * Emily Nuñez - 2240156
 * Sheila Valencia - 2243011
 * Victoria Volveras - 2241874
 */
package Modelo;

import java.util.ArrayList;

/**
 * Clase que crea un examen a partir de un banco de preguntas
 */
public class Examen 
{
    private ArrayList<String> preguntas;

    /**
     * Constructor de la clase examen
     */
    public Examen()
    {
        preguntas = new ArrayList<String>();
    }

    /**
     * Añade al arreglo de preguntas un texto que recibe como parámetro
     * @param text Pregunta a añadir
     */
    public void addPregunta(String text)
    {
        this.preguntas.add(text);
    }

    /**
     * Guarda las preguntas del arreglo preguntas en un archivo de texto
     */
    public void exportarExamen()
    {

    }
}
