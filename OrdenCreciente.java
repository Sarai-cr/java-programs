import java.util.Scanner;
public class OrdenCreciente {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa número");
        int a= sc.nextInt();
        System.out.println("Ingresa otro número");
        int b= sc.nextInt();
        System.out.println("Ingresa otro número ");
        int c =sc.nextInt();
        if(a>b){
            System.out.println(a+", "+b+","+c+" Estan en orden Decreciente");
        }else{
            System.out.println(a+", "+b+", "+c+" Estan en orden Creciente");
        }
    }
}