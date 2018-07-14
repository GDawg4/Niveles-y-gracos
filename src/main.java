
import java.util.Scanner;

public class main{
    public static void main (String[] args) {
        String ingreso = "1";
        switch (ingreso){
            case "1" :
                Scanner buscador = new Scanner(System.in);
                System.out.println("Ingrese el nombre del nuevo nivel");
                String nuevoNombre = buscador.nextLine();
                niveles nivel1 = new niveles(nuevoNombre, "");
                System.out.println("Nuevo nivel creado!");
                break;
            case "2":
                Scanner buscador2 = new Scanner(System.in);
                System.out.println("Ingrese el nombre del nivel al que desea agregar gradp");
                String buscarNivel = buscador2.nextLine();
        }
    }

}
