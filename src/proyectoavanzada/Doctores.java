package proyectoavanzada;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author crist
 */
public class Doctores {

    String nombre;
    int Identificacion;
    Tipoespecialidad especialidad ;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public int getIdentificacion() {
        return Identificacion;
    }

     public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public Doctores(String nombre, int Identificacion, Tipoespecialidad especialidad) {
        this.nombre = nombre;
        this.Identificacion = Identificacion;
        
    }

    
     public Doctores() {
    }
     
     
     

    @Override
    public String toString() {
      return "El nombre del Doctor es: "+ nombre + " ID: "+ Identificacion;
    }
     
    
}
