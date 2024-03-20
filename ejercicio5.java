package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

    public static int convertirTiempoASegundos(int dias, int horas, int minutos) {
      
        int segundosEnDias = dias * 24 * 60 * 60;
        int segundosEnHoras = horas * 60 * 60;
        int segundosEnMinutos = minutos * 60;
        
       
        int totalSegundos = segundosEnDias + segundosEnHoras + segundosEnMinutos;
        
        return totalSegundos;
    }
    
    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
    
        int dias;
        int horas;
        int minutos;
        
        System.out.print("Por favor digite los días: ");
        dias = i.nextInt();
        System.out.print("Por favor digite las horas: ");
        horas = i.nextInt();
        System.out.print("Por favor digite los minutos: ");
        minutos = i.nextInt();
        
        int totalSegundos = convertirTiempoASegundos(dias, horas, minutos);
        
        System.out.println("El total de segundos es: " + totalSegundos);
    }
}
    