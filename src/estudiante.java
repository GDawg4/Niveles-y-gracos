//Argumentos de niveles
public class estudiante {
    public String nombreEstudiante;

    public estudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String toString() {
        return nombreEstudiante;
    }
}
