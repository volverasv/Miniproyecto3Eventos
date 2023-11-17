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
    private ArrayList<Pregunta> preguntas;
    private String nombre, informe;
    private int[] tiempo; 
    private int correctas, incorrectas;  

    /**
     * Constructor de la clase examen
     */
    public Examen(String nombre, int horas, int minutos, int segundos)
    {
        this.preguntas = new ArrayList<Pregunta>();
        this.tiempo= new int[]{0,0,0};
        this.nombre = nombre;
        this.tiempo[0] = horas;
        this.tiempo[1] = minutos;
        this.tiempo[2] = segundos;
    }

    public void addPregunta(String texto)
    {
        this.preguntas.add(new Pregunta(texto));
    }

}
