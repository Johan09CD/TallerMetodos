package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    
    public static double calcularRectangulo(double lado1, double lado2, String tipoCalculo) {
        double resultado = 0;
        
        if (tipoCalculo.equalsIgnoreCase("area")) {
          resultado = lado1 * lado2;
        } else if (tipoCalculo.equalsIgnoreCase("perimetro")) {
            resultado = 2 * (lado1 + lado2);
        } else {
           System.out.println("Tipo de cálculo no válido. Por favor, elija 'area' o 'perimetro'.");
        }
        return resultado;
    }
    
    public static void main(String[] args) {
      
        Scanner i = new Scanner(System.in);
        double lado1;
        double lado2;
        String tipoCalculo; 
        
        System.out.print("Por favor digite el lado 1: ");
        lado1 = i.nextDouble();
        
        System.out.print("Por favor digite el lado 2: ");
        lado2 = i.nextDouble();
        
        System.out.print("Por favor digite lo que quiere hallar: ");
        tipoCalculo = i.next();
        double resultado = calcularRectangulo(lado1, lado2, tipoCalculo);
        
        if (!tipoCalculo.equalsIgnoreCase("area") && !tipoCalculo.equalsIgnoreCase("perimetro")) {
           
            return;
        }
        
        if (tipoCalculo.equalsIgnoreCase("area")) {
            System.out.println("El área del rectángulo es: " + resultado);
        } else {
            System.out.println("El perímetro del rectángulo es: " + resultado);
        }
    }
}

