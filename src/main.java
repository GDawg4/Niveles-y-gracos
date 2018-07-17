//Rodrigo Garoz 18102
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main{
    public static void main (String[] args) {
        //lista con todos los niveles creados
        List<niveles> nivelesActuales = new ArrayList<>();
        String ingreso = "";
        // si ingreso es 6, se termina el programa
        while(!ingreso.equals("6")){
            Scanner buscador = new Scanner(System.in);
            System.out.println("Qué desea hacer?");
            ingreso = buscador.nextLine();
            switch (ingreso){

                //en el primer caso, se agrega un nivel a la lista principal
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

                //en este caso, se busca si existe el nivel y se agrega un nuevo grado
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
                    //en caso no se encuentre ninguna instancia con ese nombre, se imprime mensaje de error
                    if (opcion2){
                        System.out.println("No se encontró este nivel, favor intentar nuevamente");
                    }
                    break;

                //Se repite el proceso de número 2, pero con un ciclo interno extra, para buscar grados en el nivel
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
                            System.out.println(nivelBusqueda.toString().replace("[", "\n").replace("]", " "));
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
                                    gradosBusqueda.addEstudiantes(Estudiante);
                                    System.out.println("Estudiante agregado!");
                                    break;
                                }
                                if (opcion2Grados) {
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

                //Se pide el nombre del nivel a mostrar y se imprime toda la información que contiene
                case "4":
                    String nivelMostrar;
                    Boolean otraOpcion = true;
                    buscador1 = new Scanner(System.in);
                    System.out.println("Ingrese el nivel que quiera mostrar");
                    nivelMostrar = buscador1.nextLine();
                    for (niveles NivelBusqueda : nivelesActuales){
                        if (nivelMostrar.equals(NivelBusqueda.getNombreNivel())){
                            System.out.println(NivelBusqueda.toString().replace("[", "\n").replace("]", " "));
                            otraOpcion = false;
                            break;
                        }
                    }
                    if (otraOpcion){
                        System.out.println("Este sistema no exite, favor intentar nuevamente    ");
                    }
                    break;

                //Se repite el proceso del número 4, pero con un ciclo interno exta
                case "5":
                    String nivelMostrar2;
                    String gradoMostrar;
                    Boolean otraOpcion2 = true;
                    buscador1 = new Scanner(System.in);
                    System.out.println("Ingrese el nivel en el que se encuentra el grado que quiere mostrar");
                    nivelMostrar2 = buscador1.nextLine();

                    for(niveles nivelBusqueda : nivelesActuales){
                        if (nivelMostrar2.equals( nivelBusqueda.getNombreNivel())){
                            buscador1 = new Scanner(System.in);
                            System.out.println("Nivel encontrado!");
                            System.out.println(nivelBusqueda.toString().replace("[", "\n").replace("]", " "));
                            System.out.println("Qué grado desea mostrar?");
                            gradoMostrar = buscador1.nextLine();

                            for(grados gradosBusqueda : nivelBusqueda.getGrados()){
                                if(gradoMostrar.equals(gradosBusqueda.getNombreGrado())){
                                    otraOpcion2 = false;
                                    System.out.println("Grado encontrado!");
                                    System.out.println(gradosBusqueda.toString().replace("[", "\n").replace("]", " "));
                                    break;
                                }
                                if (otraOpcion2) {
                                    System.out.println("Grado no encontrado, favor intentar nuevamente");
                                }
                            }
                        }
                        break;
                    }
                    if (otraOpcion2){
                        System.out.println("No se encontró este nivel, favor intentar nuevamente");
                    }
                    break;

                //6 cierra el programa
                case "6":
                    System.out.println("Gracias por utilizar nuestro sistema");
                    break;

                //cualquier otro caso, mostrar mensaje de error
                default:
                    System.out.println("Instrucción no válida, favor intentar nuevamente");
            }
        }
    }
}
