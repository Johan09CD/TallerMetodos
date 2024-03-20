
package ejercicios;

import java.util.Scanner;


public class ejercicio4 {

    public static double calcular(double radio, String tipoCalculo) {
        double resultado = 0;
        double pi = 3.1416;
        
        if (tipoCalculo.equalsIgnoreCase("perimetro")) {
            resultado = 2 * pi * radio;
            
        } else if (tipoCalculo.equalsIgnoreCase("area")) {
            resultado = pi * radio * radio;
            
        } else if (tipoCalculo.equalsIgnoreCase("volumen")) {
            
            resultado = (4 * pi * Math.pow(radio, 3)) / 3;
            
        } else {
            System.out.println("Tipo de cálculo no válido. Por favor, elija 'perimetro', 'area' o 'volumen'.");
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
   
        double radio;
        String tipoCalculo;
        
         System.out.print("Por favor digite el radio de la esfera: ");
         radio = i.nextDouble();
         
         System.out.print("Por favor digite el calculo que quiere hacer: ");
         tipoCalculo = i.next();
        
        double resultado = calcular(radio, tipoCalculo);
        
        if (!tipoCalculo.equalsIgnoreCase("perimetro") && !tipoCalculo.equalsIgnoreCase("area") && !tipoCalculo.equalsIgnoreCase("volumen")) {
            // No mostramos el resultado si el tipo de cálculo no es válido
            return;
        }
        
        if (tipoCalculo.equalsIgnoreCase("perimetro")) {
            System.out.println("El perímetro de la circunferencia es: " + resultado);
            
        } else if (tipoCalculo.equalsIgnoreCase("area")) {
            System.out.println("El área del círculo es: " + resultado);
            
        } else {
            System.out.println("El volumen de la esfera es: " + resultado);
        }
    }
}
   
