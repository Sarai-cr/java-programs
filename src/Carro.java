
public class Carro {

  int llantas;
  String marca;
  String modelo;
  int anio;
  String color;
  boolean estaEncendido = false;

  public Carro(String marca, String modelo, int anio, String color) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.color = color;
    this.llantas = 4;
  }

  public static void main(String[] args){
    Carro miCarro = new Carro("Mazda", "CX3", 2019, "rojo chido");
    Carro carroPapa = new Carro("Dodge", "RAM", 2015, "blanca");
    System.out.println("Mi carro es un " + miCarro.marca + " " + miCarro.modelo + " del año " + miCarro.anio);
    System.out.println("El carro de papá es " + carroPapa.marca + " " + carroPapa.modelo + " del año " + carroPapa.anio);
    System.out.println(miCarro);
    System.out.println(carroPapa);
    carroPapa.arrancar();
    miCarro.arrancar();
    carroPapa.arrancar();
    int[] arregloDeEnteros = {1,2,3,4};
  }

  public void arrancar() {
    if (this.estaEncendido){
      System.out.println("Oye! Ya está prendido");
    } else {
      estaEncendido = true;
      System.out.println("Está encendido el coche " + this.marca + " " + this.modelo);
    }
  }

}
