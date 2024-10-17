
package com.mycompany.figurasgeometricas;


public class Rectangulo extends FiguraGeometrica{
    
     private double lado1;
     private double lado2;
     //O(1)
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
     //O(1)
     public double obtenerArea(){
        return lado1*lado2;
    }
     //O(1)
    public double obtenerPerimetro(){
        return (2*lado1)+(2*lado2);
    }
    
}
