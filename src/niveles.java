import java.lang.reflect.Array;
import java.util.ArrayList;

public class niveles {
    public String nivelName;
    public String grados;

    public niveles(String nivelName, String grados) {
        this.nivelName = nivelName;
        this.grados = grados;
    }

    public String getNivelName() {
        return nivelName;
    }

    public void setNivelName(String nivelName) {
        this.nivelName = nivelName;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "Nivel: " + this.nivelName
                + "\n Grados:" + this.grados;
    }
}
