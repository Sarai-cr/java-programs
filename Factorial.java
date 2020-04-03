import java.util.Scanner;
public class Factorial {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa el numero eligido para la factorial");
        int n;
        int factorial=1;
        n = entrada.nextInt();
        for (int i = n; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
