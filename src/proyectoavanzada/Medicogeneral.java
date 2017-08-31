package proyectoavanzada;

/**
 *
 * @author crist
 */
public class Medicogeneral implements Tipoespecialidad{
    
    int idgeneral;
    int duraciongeneral;
    double valorcitageneral;
    

    public int getIdgeneral() {
        return idgeneral;
    }

    public void setIdgeneral(int idgeneral) {
        this.idgeneral = idgeneral;
    }

    public int getDuraciongeneral() {
        return duraciongeneral = Precioshospital.DuracionCitaMedicoGeneral;
    }
    public double getValorcitageneral() {
        return valorcitageneral = Precioshospital.ValorcitaMedicogeneral;
    }
    @Override
    public String getEspecialidad() {
        return "Medico general";
    }
      
}
