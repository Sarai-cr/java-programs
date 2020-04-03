import java.util.Scanner;

public class ArchivoBuscarSalir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione opción:");
        System.out.println("1 – Archivo");
        System.out.println("2 – Buscar");
        System.out.println("3 – Salir");
        opcion = entrada.nextInt();
        if (opcion < 1 || opcion > 3) {
            System.out.println("La opción no es correcta");
        } else {
            System.out.println("La opción es correcta");
        }
    }
}
