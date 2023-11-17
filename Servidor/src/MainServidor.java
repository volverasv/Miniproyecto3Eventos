import Modelo.Archivo;
import Modelo.Examen;
import Modelo.Pregunta;

public class MainServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Examen examen = new Examen("Examen 1", 2, 30, 0);
        examen.addPregunta("Pregunta 1-;Opcion 1;Opcion 2;Opcion 3;Opcion 4;+Opcion 2+");
        
        
    }
    
}
