import java.util.Scanner;
public class ArregloAlumnos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[2];
        double[] promedios = new double[2];
        String[] notasEnTexto = new String[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el nombre del alumno  ");
            nombres[i] = leer.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el promedio del alumno  ");
            promedios[i] = leer.nextDouble();
        }

        for (int p = 0; p < 2; p++) {
            if (promedios[p] >= 0 && promedios[p] <= 4.99) {
                notasEnTexto[p] = "Suspenso";
            } else if (promedios[p] >= 5 && promedios[p] <= 6.99) {
                notasEnTexto[p] = "Bien";
            } else if (promedios[p] >= 7 && promedios[p] <= 8.99) {
                notasEnTexto[p] = "Notable";
            } else if (promedios[p] >= 9 && promedios[p] <= 10) {
                notasEnTexto[p] = "Sobresaliente";
            }
        }
        System.out.println(" Los nombres y notas de los alumnos son las siguientes: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("\n" + nombres[i] + ": \t");
                System.out.println(promedios[i] + "\t");
                System.out.println(notasEnTexto[i]);

            }

        }

    }
