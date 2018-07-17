
import java.util.List;
//Argumentos de niveles
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


    public List<grados> getGrados() {
        return gradosColegio;
    }
//agregar un grado a los niveles
    public void addGrados(grados grados) {
        gradosColegio.add(grados);
    }

    @Override
    public String toString() {
        return "El nivel " + nombreNivel + " tiene los grados:"
                + gradosColegio;
    }
}

