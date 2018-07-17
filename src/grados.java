import java.util.List;
//Argumentos de grados
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

    public List<estudiante> getEstudiantes() {
        return estudiantes;
    }
//Agregar un estudiante a este grado
    public void addEstudiantes(estudiante nuevo) {
        estudiantes.add(nuevo);
    }

    @Override
    public String toString() {
        return "El grado " + nombreGrado + " tiene los estudiantes: "
                + estudiantes;
    }
}
