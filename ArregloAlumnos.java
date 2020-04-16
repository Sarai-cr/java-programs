import java.util.Scanner;
public class ArregloAlumnos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String []nombres = new String [2];
        double []promedios = new double [2];
        String []notasEnTexto = new String[4];

        for (int i=0; i<2;i++){
            System.out.println("Ingresa el nombre del alumno  "+i);
            nombres[i]=leer.nextLine();
        }

        for (int i=0; i<2;i++){
            System.out.println("Ingresa el promedio del alumno  "+i);
            promedios[i]=leer.nextDouble();
        }
        
            // if ((promedios>0)&&(promedios<=4.99)){
            //notasEnTexto[0]="Suspenso";
       // }else if ((promedios>5)&&(promedios<=6.99)){
            //notasEnTexto[1]="Bien";
       // }else if ((promedios>7)&&(promedios<=8.99)){
            //notasEnTexto[2]="Notable";
        //}else if ((promedios>9)&&(promedios<=10)){
           // notasEnTexto[3]="Sobresaliente";
        //}
        System.out.println(notasEnTexto[0]);
        System.out.println(notasEnTexto[1]);
        System.out.println(notasEnTexto[2]);
        System.out.println(notasEnTexto[3]);
    }
    }
