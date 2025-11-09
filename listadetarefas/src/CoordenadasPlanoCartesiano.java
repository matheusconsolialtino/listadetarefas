import java.util.Locale;
import java.util.Scanner;

public class CoordenadasPlanoCartesiano {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== LOCALIZADOR NO PLANO CARTESIANO ===");
        
        // Lendo as coordenadas
        System.out.print("Digite a coordenada X: ");
        double x = scanner.nextDouble();
        
        System.out.print("Digite a coordenada Y: ");
        double y = scanner.nextDouble();
        
        // Determinando a localização do ponto
        String resultado;
        
        if (x == 0 && y == 0) {
            resultado = "Origem";
        } else if (x == 0) {
            resultado = "Eixo Y";
        } else if (y == 0) {
            resultado = "Eixo X";
        } else if (x > 0 && y > 0) {
            resultado = "Q1";
        } else if (x < 0 && y > 0) {
            resultado = "Q2";
        } else if (x < 0 && y < 0) {
            resultado = "Q3";
        } else { // x > 0 && y < 0
            resultado = "Q4";
        }
        
        // Exibindo o resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Coordenadas: (%.1f, %.1f)%n", x, y);
        System.out.println("Localização: " + resultado);
        
        scanner.close();
    }
}