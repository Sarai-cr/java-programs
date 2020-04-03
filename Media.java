import java.util.Scanner;
public class Media {
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa 5 números para calcular la media");
        int n1= entrada.nextInt();
        int n2= entrada.nextInt();
        int n3= entrada.nextInt();
        int n4= entrada.nextInt();
        int n5= entrada.nextInt();
        int m;
        m=(n1+n2+n3+n4+n5)/5;
        System.out.println("La media de los 5 números es:"+m);
    }
}
