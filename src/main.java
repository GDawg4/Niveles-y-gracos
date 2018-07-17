
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{

    public static void main (String[] args) {
        List<niveles> nivelesActuales = new ArrayList<>();
        String ingreso = "";
        while(!ingreso.equals("6")){
            Scanner buscador = new Scanner(System.in);
            System.out.println("Qué desea hacer?");
            ingreso = buscador.nextLine();
            switch (ingreso){
                case "1":
                    String nombreNuevoN;
                    buscador = new Scanner(System.in);
                    List<grados> nuevaLista = new ArrayList<>();
                    System.out.println("Ingrese el nombre del nuevo nivel");
                    nombreNuevoN = buscador.nextLine();
                    System.out.println(ingreso);
                    niveles nivel1 = new niveles(nombreNuevoN, nuevaLista);
                    nivelesActuales.add(nivel1);
                    break;
                case "2":
                    String buscarNivel;
                    String agregarGrado;
                    Boolean opcion2 = true;
                    Scanner buscador1 = new Scanner(System.in);
                    System.out.println("A qué nivel desea agregar un grado?");
                    buscarNivel = buscador1.nextLine();

                    for(niveles nivelBusqueda : nivelesActuales){
                        if (buscarNivel.equals( nivelBusqueda.getNombreNivel())){
                            List<estudiante> nuevaListaE = new ArrayList<>();
                            System.out.println("Nivel encontrado!");
                            opcion2 = false;
                            buscador1 = new Scanner(System.in);
                            System.out.println("Qué grado desea agregar?");
                            agregarGrado = buscador1.nextLine();
                            grados nuevoGrado = new grados(agregarGrado,nuevaListaE);
                            nivelBusqueda.addGrados(nuevoGrado);
                            break;
                        }
                    }
                    if (opcion2){
                        System.out.println("No se encontró este nivel, favor intentar nuevamente");
                    }
                    break;
                case "3":
                    String buscarNivelG;
                    String buscarGrado;
                    String agregarNivel;
                    Boolean opcion2Grados = true;
                    buscador1 = new Scanner(System.in);
                    System.out.println("En qué nivel se encuentra el grado?");
                    buscarNivelG = buscador1.nextLine();

                    for(niveles nivelBusqueda : nivelesActuales){
                        if (buscarNivelG.equals( nivelBusqueda.getNombreNivel())){
                            buscador1 = new Scanner(System.in);
                            System.out.println("Nivel encontrado!");
                            System.out.println(nivelBusqueda.toString());
                            System.out.println("A qué grado desea agregar el estudiante?");
                            buscarGrado = buscador1.nextLine();

                            for(grados gradosBusqueda : nivelBusqueda.getGrados()){
                                if(buscarGrado.equals(gradosBusqueda.getNombreGrado())){
                                    String nuevoEstudiante;
                                    opcion2Grados = false;
                                    buscador1 = new Scanner(System.in);
                                    System.out.println("Grado encontrado!");
                                    System.out.println("Cuál es el nombre del estudiante que desea ingresar?");
                                    nuevoEstudiante = buscador1.nextLine();
                                    estudiante Estudiante = new estudiante(nuevoEstudiante);
                                    System.out.println("Estudiante agregado!");
                                    break;
                                }
                             if (opcion2Grados){
                                 System.out.println("Grado no encontrado, favor intentar nuevamente");
                             }
                            }
                        }
                        break;
                    }
                    if (opcion2Grados){
                        System.out.println("No se encontró este nivel, favor intentar nuevamente");
                    }
                    break;
                case "A":
                    for (niveles buscar: nivelesActuales){
                        System.out.println(buscar.toString());
                    }
            }
        }
    }
}
