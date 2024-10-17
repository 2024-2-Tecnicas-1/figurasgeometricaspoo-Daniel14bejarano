
package com.mycompany.figurasgeometricas;


public class Circulo extends FiguraGeometrica {
    
    private double radio;
    //O(1)
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    //O(1)
    public double obtenerArea(){
        return Math.PI * radio * radio;
    }
    //O(1)
    public double obtenerPerimetro(){
        return 2 * Math.PI * radio;
    }
    
    
}
