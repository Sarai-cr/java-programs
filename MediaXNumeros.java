import java.util.Scanner;
public class MediaXNumeros {
    public static void main (String []args){
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Cuántos números deseas poner?");
        int n= entrada.nextInt();
        double suma=0;
        for (int i=0; i<n;i++){
            System.out.println("Escribe el número"+(i+1));
            suma=suma+entrada.nextDouble();
        }
        double promedio=suma/n;
        System.out.println("La media es:"+promedio);
    }
}
