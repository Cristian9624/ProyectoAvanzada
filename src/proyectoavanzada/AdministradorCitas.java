package proyectoavanzada;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class AdministradorCitas {
    private ArrayList<Doctores> doctores;
    private ArrayList<Pacientes> pacientes;
    private ArrayList<Citas> citas;
    
    public AdministradorCitas(){
    
        this.doctores = new ArrayList();
        this.pacientes = new ArrayList();
        this.citas = new ArrayList<>();
        
    }

    public ArrayList<Doctores> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctores> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Pacientes> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Pacientes> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Citas> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Citas> citas) {
        this.citas = citas;
    }
       
}
