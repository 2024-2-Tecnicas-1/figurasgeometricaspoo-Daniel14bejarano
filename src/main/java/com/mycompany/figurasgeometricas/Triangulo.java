
package com.mycompany.figurasgeometricas;


public class Triangulo extends FiguraGeometrica{
    
   private double base;
   private double altura;
   //O(1)
    public Triangulo(String nombre, String color, double base, double altura ) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
   
   //O(1)
   public double obtenerArea(){
      return (base*altura)/2;
   }
   //O(1)
   public double obtenerPerimetro(){
      return (altura*2)+base;
   }
   
}
