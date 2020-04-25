package src.task1;

public class Alumno {

    private String nombre;
    private String cuenta;
    private String telefono;
    private String email;
    private char sexo;
    private double promedio;
    private int edad;

    public Alumno(String nombre, String cuenta, String teléfono, String email, char sexo, double promedio, int edad) {
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
}
