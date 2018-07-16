import java.util.List;

public class grados {
    public String nombreGrado;
    private List<estudiante> estudiantes;

    public grados(String nombreGrado, List<estudiante> estudiantes) {
        this.nombreGrado = nombreGrado;
        this.estudiantes = estudiantes;
    }

    public String getNombreGrado() {
        return nombreGrado;
    }

    public void setNombreGrado(String nombreGrado) {
        this.nombreGrado = nombreGrado;
    }

    public List<estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
