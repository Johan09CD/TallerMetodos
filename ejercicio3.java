package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

    public static double convertirDolaresAEuros(double dolares) {
       
        double tasaCambio = 1.33250;
        
        double euros = dolares / tasaCambio;
        
        return euros;
    }
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
  
        double dolares;
        
        System.out.print("Por favor digite el numero de dolares que quiere cambiar a euros: ");
        dolares = i.nextDouble();
        
        double euros = convertirDolaresAEuros(dolares);
        
        System.out.println(dolares + " dólares equivalen a " + euros + " euros.");
    }
}
   
