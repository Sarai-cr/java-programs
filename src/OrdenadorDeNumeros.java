import java.util.ArrayList;
import java.util.Scanner;

public class OrdenadorDeNumeros {

  public static void main(String args[]) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa un número entero");
    int n1 = leer.nextInt();
    System.out.println("Ingresa otro número entero");
    int n2 = leer.nextInt();
    System.out.println("Ingresa otro número entero");
    int n3 = leer.nextInt();
    int[] numerosOrdenados = ordenar(n1, n2, n3);
    System.out.println("El orden de menor a mayor es: ");
    imprimeArreglo(numerosOrdenados);
    int[] mayorAMenor = voltearArreglo(numerosOrdenados);
    System.out.println("El orden de mayor a menor es: ");
    imprimeArreglo(mayorAMenor);
  }

  public static int[] ordenar(int n1, int n2, int n3) {
    if (n1 > n2 && n1 > n3 && n2 > n3) {
      return new int[]{n3, n2, n1};
    } else if (n1 > n2 && n1 > n3 && n3 > n2) {
      return new int[]{n2, n3, n1};
    } else if (n2 > n1 && n2 > n3 && n1 > n3) {
      return new int[]{n3, n1, n2};
    } else if (n2 > n1 && n2 > n3 && n3 > n1) {
      return new int[]{n1, n3, n2};
    } else if (n3 > n1 && n3 > n2 && n2 > n1) {
      return new int[]{n1, n2, n3};
    } else {
      return new int[]{n2, n1, n3};
    }
  }

  public static int[] voltearArreglo(int[] arreglo) {
    int temporal = arreglo[0];
    arreglo[0] = arreglo[2];
    arreglo[2] = temporal;
    return arreglo;
  }

  public static void imprimeArreglo(int[] arreglo) {
    System.out.print(arreglo[0] + " ");
    imprimeSiIguales(arreglo[0],arreglo[1]);
    imprimeSiIguales(arreglo[1],arreglo[2]);
    System.out.println();
  }

  public static void imprimeSiIguales(int n1, int n2) {
    if (n1 == n2)
      System.out.print(n2 + " ");
    else
      System.out.print("\n" + n2 + " ");
  }
}

