package ejercicios;

public class ejercicio6 {
    
    public static void main(String[] args) {
      
        int segundos = 203700;
        System.out.println(convertirTiempo(segundos, "dias"));
        System.out.println(convertirTiempo(segundos, "horas")); 
        System.out.println(convertirTiempo(segundos, "minutos")); 
    }

    public static double convertirTiempo(int segundos, String tipo) {
        double resultado = 0;

        switch (tipo.toLowerCase()) {
            case "dias":
                resultado = segundos / (24.0 * 3600); 
                break;
            case "horas":
                resultado = segundos / 3600.0; 
                break;
            case "minutos":
                resultado = segundos / 60.0;
                break;
            default:
                System.out.println("Tipo de conversión no válido");
        }

        return resultado;
    }
}