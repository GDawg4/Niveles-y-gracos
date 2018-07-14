import java.util.Scanner;

public class main{
    public static void main (String[] args) {
        niveles nivel1 = new niveles();
        System.out.println("Ingrese el nombre del nuevo nivel");
        Scanner nombre = new Scanner(System.in);
        nivel1.setNombre_nivel(nombre);
        System.out.println(nivel1.toString());
    }

}
