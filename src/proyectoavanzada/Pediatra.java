package proyectoavanzada;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Pediatra implements Tipoespecialidad{
    
    int idpediatra;
    int duracionpediatra;
    double valorclitapediatra;

    public int getIdpediatra() {
        return idpediatra;
    }

    public void setIdpediatra(int idpediatra) {
        this.idpediatra = idpediatra;
    }

    public int getDuracionpediatra() {
        return duracionpediatra = Precioshospital.DuracionCitaPediatra;
    }
    public double getValorclitapediatra() {
        return valorclitapediatra = Precioshospital.ValorcitaPediatra;
    }

    public Pediatra(int idpediatra, int duracionpediatra, double valorclitapediatra) {
        this.idpediatra = idpediatra;
        this.duracionpediatra = duracionpediatra;
        this.valorclitapediatra = valorclitapediatra;
    }
    
    @Override
    public String getEspecialidad() {
        return "Pediatra";
     }
    
    
}
