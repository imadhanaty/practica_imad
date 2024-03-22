package app;

import java.util.Scanner;

import modelos.Rectangulo;
import modelos.circulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Ingrese la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.print("Ingrese la altura del rectángulo: ");
        int altura = sc.nextInt();
        Rectangulo rectangul = new Rectangulo(base, altura);
        System.out.println(rectangul.toString());
        System.out.println("\tArea del rectangulo es : " + rectangul.area_calculation());
        System.out.println("Perimetro del rectangulo es: " + rectangul.perimetro_calculation());
        
        System.out.println("Ingrese el radio del círculo :");
        double radioCirculo = sc.nextDouble();
        circulo c = new circulo(radioCirculo); 
        System.out.println("Circulo 1:");
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Área: " + c.area());
        System.out.println("Perímetro: " + c.obtenerPerimetro());
        
	}

}
