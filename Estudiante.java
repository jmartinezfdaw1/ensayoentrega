
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Estudiante
{
    private String nombre;
    private int nota;
     

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota)    {
        nombre = queNombre;
        nota = queNota;
         
    }

    /**
     * accesor del nombre
     */
    public String getNombre() {
        return nombre;
         
    }
    
    
     /**
     * 
     */
    public int getNota() {
        return nota;
         
    }
    
    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
                "\nNota: " + nota);

    }

}
