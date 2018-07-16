
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
                    Scanner buscador1 = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del nuevo nivel");
                    ingreso = buscador1.nextLine();
                    System.out.println(ingreso);
                    List<grados> nuevaLista = new ArrayList<>();
                    niveles nivel1 = new niveles("Hola", nuevaLista);
                    nivelesActuales.add(nivel1);
                    System.out.println(nivelesActuales);
                //case "3":
            }
        }
    }
}
