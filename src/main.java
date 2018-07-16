
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
                    System.out.println("Ingrese el nombre del nuevo nivel");
                    nombreNuevoN = buscador.nextLine();
                    System.out.println(ingreso);
                    List<grados> nuevaLista = new ArrayList<>();
                    niveles nivel1 = new niveles(nombreNuevoN, nuevaLista);
                    nivelesActuales.add(nivel1);
                    break;
                case "2":
                    String buscarNivel;
                    String agregarNivel;
                    Scanner buscador1 = new Scanner(System.in);
                    System.out.println("A qué nivel desea agregar un grado?");
                    buscarNivel = buscador1.nextLine();
                    for(niveles nivelBusqueda : nivelesActuales){
                        if (buscarNivel.equals( nivelBusqueda.getNombreNivel())){
                            System.out.println("Nivel encontrado!");
                            break;
                        }
                    }
            }
        }
    }
}
