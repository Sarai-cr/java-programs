import java.util.Scanner;

public class Vocales{
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa una vocal");
        char v = leer.next().charAt(0);
        if (v=='a'){
            System.out.println ("Es vocal");
        }else if (v=='e'){
            System.out.println ("Es vocal");
        }else if (v=='i'){
            System.out.println ("Es vocal");
        }else if (v=='o'){
            System.out.println ("Es vocal");
        }else if (v=='u'){
            System.out.println("Es vocal");
        }else{
            System.out.println ("Es consonante");
        }
    }
}