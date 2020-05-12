package src.VehiculosVoladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class  Main {
    private static Scanner leer = new Scanner(System.in);
    private static List<Avioneta> avionetas = new ArrayList<Avioneta>();
    private static List<Helicoptero> helicopteros = new ArrayList<Helicoptero>();
    private static List<Dron> drones = new ArrayList<Dron>();

        public static void main (String[] args) {
            int opcion;

            do {

                opcion = imprimeMenuDeOpciones();
                leer.nextLine();
                switch (opcion) {
                    case 1:
                        creaAvioneta(avionetas);
                        break;
                    case 2:
                        creaHelicóptero(helicopteros);
                        break;
                    case 3:
                        creaDron(drones);
                        break;
                    case 4:
                        imprimeInvetarioDeAvioneta();
                        break;
                    case 5:
                        imprimeInventarioDeHelicoptero();
                        break;
                    case 6:
                        imprimeInventarioDeDron();
                }

            }while (opcion != 0);

        }

        public static void imprimeInvetarioDeAvioneta() {
            out.println("Hay " + avionetas.size() + " Avionetas");
            for (Avioneta avioneta : avionetas) {
                out.println(avionetas);
            }
        }

            public static void imprimeInventarioDeHelicoptero() {
            out.println("Hay " + helicopteros.size() + " Helicópteros");
            for (Helicoptero helicoptero : helicopteros) {
                out.println(helicoptero);
            }
        }

        public static void imprimeInventarioDeDron() {
            out.println("Hay " + drones.size() + " Drones");
            for (Dron drones : drones) {
                out.println(drones);
            }
        }

        public static int imprimeMenuDeOpciones() {
            out.println("Elige una opción:");
            out.println("1 - Crear Avioneta");
            out.println("2 - Crear Helicóptero");
            out.println("3 - Crear Dron");
            out.println("4 - Imprime inventario de avionetas");
            out.println("5 - Imprime inventario de helicópteros");
            out.println("6 - Imprime inventario de drones");
            out.println("0 - Salir");
            out.println();
            return leer.nextInt();

        }

        public static void creaAvioneta (List<Avioneta> avionetas) {
            out.println("Ingresa la marca de la Avioneta");
            String marca = leer.nextLine();
            out.println("Ingresa el nombre ");
            String nombre = leer.nextLine();
            out.println("Ingresa la matrícula");
            int matricula = leer.nextInt();
            out.println("Ingresa la cantidad de hélices");
            int helices = leer.nextInt();
            avionetas.add( new Avioneta(marca, nombre, matricula, helices) );
        }

        public static void creaHelicóptero (List<Helicoptero> helicopteros) {
            out.println("Ingresa la marca del helicóptero");
            String marca = leer.nextLine();
            out.println("Ingresa el nombre ");
            String nombre = leer.nextLine();
            out.println("Ingresa la matrícula");
            int matricula = leer.nextInt();
            out.println("Ingresa el tipo motor");
            String motor = leer.nextLine();
            leer.nextLine();
            helicopteros.add( new Helicoptero(marca, nombre, matricula, motor) );
        }

        public static void creaDron (List<Dron> drones) {
            out.println("Ingresa la marca del dron");
            String marca = leer.nextLine();
            out.println("Ingresa el nombre ");
            String nombre = leer.nextLine();
            out.println("Ingresa la matrícula");
            int matricula = leer.nextInt();
            out.println("Ingresa el tipo de cámara");
            String tipoDeCamara = leer.nextLine();
            leer.nextLine();
            drones.add( new Dron(marca, nombre, matricula, tipoDeCamara) );
        }

    }

