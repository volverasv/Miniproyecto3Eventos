/* Angie Joya - 2322609
 * Emily Nuñez - 2240156
 * Sheila Valencia - 2243011
 * Victoria Volveras - 2241874
 */
package Modelo;

public class Pregunta 
{
    private String enunciado;
    private String[] opciones;
    private String respuesta;

    public Pregunta()
    {
        this.enunciado = "";
        this.opciones = new String[]{"","","",""};
        this.respuesta = "";        
    }

    public void setEnunciado(String texto)
    {
        String[] datos; 
        datos = texto.trim().split("-");
        this.enunciado = datos[0];
    }
}
