package proyectoavanzada;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Pacientes {
    
    String nombres;
    int Id;
    //String foto;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Pacientes(String nombres, int Id) {
        this.nombres = nombres;
        this.Id = Id;
    }

}
