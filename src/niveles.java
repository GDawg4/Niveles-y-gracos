
import java.util.List;

public class niveles {
    public String nombreNivel;
    public List<grados> gradosColegio;

    public niveles(String nombreNivel, List<grados> grados) {
        this.nombreNivel = nombreNivel;
        this.gradosColegio = grados;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public List<grados> getGrados() {
        return gradosColegio;
    }

    public void addGrados(grados grados) {
        gradosColegio.add(grados);
    }
}
