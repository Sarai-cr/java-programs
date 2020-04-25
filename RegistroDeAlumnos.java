package src.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroDeAlumnos {

    public static void main(String[] args) {
        int total = 5;
        Scanner scanner = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[total];
        for (int i = 0; i < total; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la cuenta del alumno " + (i + 1));
            String cuenta = scanner.nextLine();
            System.out.println("Ingrese el teléfono del alumno " + (i + 1));
            String telefono = scanner.nextLine();
            System.out.println("Ingrese el email del alumno " + (i + 1));
            String email = scanner.nextLine();
            System.out.println("Ingrese el sexo (M/F) del alumno " + (i + 1));
            char sexo = scanner.nextLine().charAt(0);
            System.out.println("Ingrese el promedio del alumno " + (i + 1));
            double promedio = scanner.nextDouble();
            System.out.println("Ingrese la edad del alumno " + (i + 1));
            int edad = scanner.nextInt();
            scanner.nextLine();
            alumnos[i] = new Alumno(nombre, cuenta, telefono, email, sexo, promedio, edad);
        }
        for (int i = 0; i < total; i++) {
            System.out.println(alumnos[i]);
        }
    }

}
