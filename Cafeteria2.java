import java.util.Scanner;
public class Cafeteria2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int acumulador=0;
        int precio;
        int condicion=2;
        do{
            System.out.println("1-Americano...$20\n2-Express...$25\n3-Cappuccino...$30\n4-Té...$22\n5-Salir");
            System.out.println("Elige una opción");
            int opcion=leer.nextInt();

            switch(opcion){
                case 1:precio = 20;break;
                case 2:precio = 25;break;
                case 3:precio = 30;break;
                case 4:precio = 22;break;
                default:precio=0;

            }
            acumulador=acumulador+precio;

            System.out.println("¿Deseas compara algo más? 1.Si 2.No");
            condicion=leer.nextInt();

        }while(condicion!=2);

      System.out.println("Total a pagar:"+acumulador);
    }
}
