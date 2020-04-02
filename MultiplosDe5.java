import java.util.Scanner;
public class MultiplosDe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Los multiplos de 5 en una numeración del 1-100 son:");
        int n=1;
        while (n<=100){
            if (n%5==0){
                System.out.println(n);
            }
            n++;
        }
        }
        }