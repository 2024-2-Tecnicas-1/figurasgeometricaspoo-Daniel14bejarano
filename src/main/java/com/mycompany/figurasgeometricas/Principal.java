package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        System.out.println("Ingrese el tipo de figura \n 1. Circulo \n 2. Rectángulo\n 3. Triángulo ");
        int tipo= sc.nextInt();
        
         FiguraGeometrica figura = null;
        
        if (tipo==1){
            System.out.println("“Ingrese el radio del círculo");
            double radio = sc.nextDouble();
            figura = new Circulo(nombre, color, radio);
        }else{if(tipo==2){
            System.out.println("Ingrese el valor del lado 1 del rectángulo");
            double lado1= sc.nextDouble();
            System.out.println("Ingrese el valor del lado 2 del rectángulo");
            double lado2= sc.nextDouble();
            figura = new Rectangulo(nombre, color, lado1, lado2);
        }else{if(tipo==3){
            System.out.println("“Ingrese el valor de la base del triángulo”");
            double base= sc.nextDouble();
            System.out.println("“Ingrese el valor de la altura del triángulo”");
            double altura= sc.nextDouble();
            figura = new Triangulo(nombre, color, base, altura);
        }
        }
        }
        System.out.println("Figura seleccionada: " + figura.getNombre());
            System.out.println("Color de la figura: " + figura.getColor());
            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Perímetro: " + figura.obtenerPerimetro());
    }
}
