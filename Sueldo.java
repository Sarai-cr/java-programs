import java.util.*; //comando importar scanner
class sueldo {
    public static void main(String args[]){
        Scanner entrada= new Scanner(System.in);//nueva entrada
        System.out.println("¿Cuál es la antigüedad del trabajador?");
        double antiguedad=entrada.nextDouble();
        double sueldo=40000;
        if (antiguedad >10) {
            sueldo = sueldo + (sueldo*.10);
            System.out.println("caso 1:El sueldo es de:"+ sueldo);
        } else {
            if ((antiguedad<10)&&(antiguedad>5)) {
                sueldo = 40000+(40000*.07);
                System.out.println("caso 2:El sueldo es de:"+ sueldo);
            } else {
                if ((antiguedad<5)&&(antiguedad>3)){ //variable de control
                    sueldo = 40000+(40000*.05);
                    System.out.println("caso 3:El sueldo es de:"+ sueldo);
                } else {
                    if (antiguedad<3) {
                        sueldo = 40000+(40000*.03);
                        System.out.println("caso 4:El sueldo es de:"+ sueldo);
                    }

                } //imprimir informacion en pantalla
            }
        } //cierre del primer else
    } // cierre del main
} //cierre del class