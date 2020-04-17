package src;

import java.util.Scanner;
public class Paises {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] [] ciudades = new String [4] [3];
        String [] paises = new String [4];
        System.out.println (" Ingresa cuatro países ");
        int p= 0; int c = 0;
        for (p = 0 ; p < 4 ; p++ ) {
            paises [p] = leer.nextLine();
        }
        for (p = 0 ; p < 4 ; p++ ) {
            System.out.println (" Ingresa tres ciudades de: "+ paises[p]);

            for (c = 0 ; c < 3 ; c++ ) {
                ciudades[p][c]= leer.nextLine();
            }
            }
        System.out.println (" Los países y ciudades son los siguientes: ");
        for (p = 0 ; p < 4 ; p++ ) {
            System.out.println ("\n"+paises[p]+": \t");
            for (c = 0 ; c < 3 ; c++ ) {
                System.out.println (ciudades[p][c]+"\t");
            }
        }
    }
}
