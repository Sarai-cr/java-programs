import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String args[]) {
    Scanner leer = new Scanner(System.in);
    int numero, residuo;
    boolean esPrimo = true;
    System.out.println("Ingresa un número entero");
    numero = leer.nextInt();
    for (int i = 2; i <= numero-1 ; i++) {
      residuo = numero % i;
      System.out.println (numero + " módulo " + i + " es: " + residuo);
      if (residuo == 0){
        esPrimo = false;
      }
    }
    if (esPrimo){
      System.out.println ("Es primo");
    }else{
      System.out.println ("No es primo");
    }
  }
}




