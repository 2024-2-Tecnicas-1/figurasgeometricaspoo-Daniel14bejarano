
package com.mycompany.figurasgeometricas;


public class FiguraGeometrica {
    
    private String nombre;
    private String color;
    //O(1)
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    //O(1)
    public String getNombre() {
        return nombre;
    }
    //O(1)
    public String getColor() {
        return color;
    }
    //O(1)
    public double obtenerArea(){
        return 0;
    }
    //O(1)
    public double obtenerPerimetro(){
        return 0;
    }  
    
}
