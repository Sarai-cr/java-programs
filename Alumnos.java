package src;
import src.task1.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumnos {
    private String nombre;
    private String cuenta;
    private String telefono;
    private String email;
    private char sexo;
    private double promedio;
    private int edad;

    public Alumnos(String nombre, String cuenta, String teléfono, String email, char sexo, double promedio, int edad) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.telefono = teléfono;
        this.email = email;
        this.sexo = sexo;
        this.promedio = promedio;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + this.nombre + "\n" +
                "\tcuenta: " + this.cuenta + "\n" +
                "\tteléfono: " + this.telefono + "\n" +
                "\temail: " + this.email + "\n" +
                "\tsexo: " + this.sexo + "\n" +
                "\tpromedio: " + this.promedio + "\n" +
                "\tedad: " + this.edad + "\n";
    }
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
