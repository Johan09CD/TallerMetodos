package ejercicios;
import java.util.Scanner;
public class ejercicio1 {
    
    public static double calcularPrecioConDescuento(double precio, double porcentajeDescuento) {
        
        double descuento = precio * (porcentajeDescuento / 100);
        
        double precioConDescuento = precio - descuento;
        
        return precioConDescuento;
    }
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner (System.in);
       
        double precioOriginal;
        double porcentajeDescuento;
        
        System.out.print("Por favor ingrese el valor del precio original: ");
        precioOriginal = i.nextDouble ();
        
        System.out.print("Por favor ingrese el valor del porcentaje de descuento: ");
        porcentajeDescuento = i.nextDouble ();
        
        double precioConDescuento = calcularPrecioConDescuento(precioOriginal, porcentajeDescuento);
        
        System.out.println("El precio final con descuento es de: " + precioConDescuento);
    }
}

    

