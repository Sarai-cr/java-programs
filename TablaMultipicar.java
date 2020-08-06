package src;
import java.util.Scanner;

public class TablaMultipicar {
    private int valor;
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor=valor;
    }

    public void mostrarTabla() {
        int tabla;
        int contador;
        int x = 0;
        while (x<=10){
            tabla=this.valor*x;
            System.out.println (x+"X"+this.valor+"="+tabla);
            x++;
        }
    }

    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        TablaMultipicar t1= new TablaMultipicar();
        System.out.println ("Tabla de Multiplicar");
        System.out.println ("De qué número quieres ver la tabla de multilicar:");
        int valor=teclado.nextInt();
        t1.setValor(valor);
        t1.mostrarTabla ();
    }
}
