package src.HondaMotors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class Main {

    private static Scanner leer = new Scanner(System.in);
    private static List<Sedan> sedanes = new ArrayList<Sedan>();
    private static List<Camionetas> camionetas = new ArrayList<Camionetas>();
    private static List<Deportivos> deportivos = new ArrayList<Deportivos>();
    private static List<Motocicletas> motocicletas = new ArrayList<Motocicletas>();
    private static List<Acuáticos> acuáticos = new ArrayList<Acuáticos>();

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = imprimeMenu();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    creaSedan(sedanes);
                    break;
                case 2:
                    creaCamionetas(camionetas);
                    break;
                case 3:
                    creaDeportivos(deportivos);
                    break;
                case 4:
                    creaMotocicletas(motocicletas);
                case 5:
                    creaAcuaticos(acuáticos);
                    break;
                case 6:
                    imprimeInventarioDeSedanes();
                case 7:
                    imprimeInventarioDeCamionetas();
                case 8:
                    imprimeInventarioDeDeportivos();
                case 9:
                    imprimeInventarioDeMotocicletas();
                case 10:
                    imprimeInventarioDeAcuaticos();
            }
        } while (opcion != 0);


    }

    private static void imprimeInventarioDeSedanes() {
        out.println("Hay " + sedanes.size() + " sedanes");
        for (Sedan sedan : sedanes) {
            out.println(sedan);
        }
    }

    private static void imprimeInventarioDeCamionetas() {
        out.println("Hay " + camionetas.size() + " Camionetas");
        for (Camionetas camionetas : camionetas) {
            out.println(camionetas);
        }
    }

    private static void imprimeInventarioDeDeportivos() {
        out.println("Hay " + deportivos.size() + " Deportivos");
        for (Deportivos deportivos : deportivos) {
            out.println(deportivos);
        }
    }

    private static void imprimeInventarioDeMotocicletas() {
        out.println("Hay " + motocicletas.size() + " Motocicletas");
        for (Motocicletas motocicletas : motocicletas) {
            out.println(motocicletas);
        }
    }

    private static void imprimeInventarioDeAcuaticos() {
        out.println("Hay " + acuáticos.size() + " Acuáticos");
        for (Acuáticos acuáticos : acuáticos) {
            out.println(motocicletas);
        }
    }


    public static int imprimeMenu() {
        out.println("Elige una opción:");
        out.println("1 - Crear Sedan");
        out.println("2 - Crear Camioneta");
        out.println("3 - Crear Deportivo");
        out.println("4 - Crear Motocicleta");
        out.println("5 - Crear Coso acuático");
        out.println("6 - Imprime inventario de sedanes");
        out.println("7 - Imprime inventario de camionetas");
        out.println("8 - Imprime inventario de deportivos");
        out.println("8 - Imprime inventario de motocicletas");
        out.println("9 - Imprime inventario de acuáticos");
        out.println("0 - Salir");
        out.println();
        return leer.nextInt();
    }

    public static void creaSedan(List<Sedan> sedanes) {
        out.println(" Ingresa el modelo del Sedán ");
        String modelo = leer.nextLine();
        System.out.println(" Ingresa el color ");
        String color = leer.nextLine();
        System.out.println(" Ingresa el precio ");
        int precio = leer.nextInt();
        System.out.println(" Ingresa los pasajeros  ");
        int pasajeros = leer.nextInt();
        System.out.println(" Ingresa los caballos de fuerza ");
        int caballosDeFuerza = leer.nextInt();
        leer.nextLine();
        System.out.println(" Ingresa el tipo de transmisión ");
        String transmision = leer.nextLine();
        System.out.println(" Ingresa la capacidad del motor ");
        int capacidadMotor = leer.nextInt();
        sedanes.add( new Sedan(modelo, color, precio, pasajeros, caballosDeFuerza, capacidadMotor, transmision) );
    }

    public static void creaCamionetas(List<Camionetas> camionetas) {
        out.println(" Ingresa el modelo de la camioneta");
         String modelo = leer.nextLine();
         leer.nextLine();
        System.out.println(" Ingresa el color ");
         String color = leer.nextLine();
         leer.nextLine();
        System.out.println(" Ingresa el precio ");
        int precio = leer.nextInt();
        System.out.println(" Ingresa los pasajeros  ");
         int pasajeros = leer.nextInt();
        System.out.println(" Ingresa el peso vehícular ");
         int pesoVehicular = leer.nextInt();
        System.out.println(" Ingresa la capacidad del tanque ");
         double capacidadTanque = leer.nextDouble();
        System.out.println(" Ingresa el diámetro de giro ");
         double diametroDeGiro = leer.nextDouble();

         camionetas.add ( new Camionetas (modelo, color, precio, pasajeros, pesoVehicular, capacidadTanque, diametroDeGiro));
    }

    public static void creaDeportivos(List<Deportivos> deportivos) {
        out.println(" Ingresa el modelo del carro deportivo");
        String  modelo = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el color ");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el precio ");
        int precio = leer.nextInt();
        System.out.println(" Ingresa los pasajeros  ");
        int pasajeros = leer.nextInt();
        System.out.println(" Ingresa el número de cilindros ");
        int cilindros = leer.nextInt();
        System.out.println(" Ingresa el tipo de transmisión ");
        String transmision = leer.nextLine();
         leer.nextLine();
        System.out.println(" Ingresa las medidas de los neumáticos ");
        String  neumaticos = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el radio de los rines");
        String  rines = leer.nextLine();
        leer.nextLine();

         deportivos.add (new Deportivos( modelo, color, precio, pasajeros, cilindros, transmision, neumaticos, rines ));
    }

    public static void creaMotocicletas(List<Motocicletas> motocicletas) {

        out.println(" Ingresa el modelo de la motocicleta");
        String modelo = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el color ");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el precio ");
        int precio = leer.nextInt();
        System.out.println(" Ingresa los pasajeros  ");
        int pasajeros = leer.nextInt();
        System.out.println(" Ingresa el tipo de arranque ");
        String arranque = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el diámetro por carrera ");
        String diametroPorCarrera = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el tipo de chasis ");
        String  chasis = leer.nextLine();
        leer.nextLine();

         motocicletas.add(new Motocicletas(modelo,color,precio, pasajeros,arranque, diametroPorCarrera,chasis));
    }

    public static void creaAcuaticos(List<Acuáticos> acuáticos) {
        out.println(" Ingresa el modelo del vehículo acuático");
        String modelo = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el color ");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa el precio ");
        int precio = leer.nextInt();
        System.out.println(" Ingresa los pasajeros  ");
        int pasajeros = leer.nextInt();
        System.out.println(" Ingresa la capacidad de aceite ");
        String capacidadDeAceite = leer.nextLine();
        leer.nextLine();
        System.out.println(" Ingresa la cantidad de válvulas ");
        int valvulasTotales = leer.nextInt();
        System.out.println(" Ingresa el tipo de alternador ");
        String  alternador = leer.nextLine();
        leer.nextLine();

         acuáticos.add (new Acuáticos(modelo,color,precio, pasajeros,capacidadDeAceite,valvulasTotales,alternador));
    }

}
