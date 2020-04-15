import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Seleccione opción:");
        System.out.println("1 – Área del círculo");
        System.out.println("2 – Área del cuadrado");
        System.out.println("3 – Área de un triángulo");
        System.out.println("4 – Salir");
        int opcion = leer.nextInt();

        do {
            if (opcion == 1) {
                System.out.println("Ingresa el radio del círculo");
                double r = leer.nextDouble();
                double A = 3.1416 * (r * r);
                System.out.println("E área es: " + A);
            } else if (opcion == 2) {
                System.out.println("Ingresa el valor de uno de los lados del cuadrado ");
                double l = leer.nextDouble();
                double A = l * l;
                System.out.println("E área es: " + A);
            } else if (opcion == 3) {
                System.out.println("Ingresa el valor de la base y de altura");
                double h = leer.nextDouble();
                double b = leer.nextDouble();
                double A = (b * h) / 2;
                System.out.println("E área es: " + A);
            }else if (opcion==4){
                System.out.println("bais");
            }
        }

        while (opcion!=0);
        
    }
}


