import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("Escolha a escala de entrada:");
        System.out.println("C - Celsius");
        System.out.println("F - Fahrenheit");
        System.out.print("Digite sua opção (C/F): ");
        
        char escala = scanner.next().toUpperCase().charAt(0);
        
        // Verifica se a opção é válida
        if (escala != 'C' && escala != 'F') {
            System.out.println("Opção inválida! Use 'C' para Celsius ou 'F' para Fahrenheit.");
        } else {
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            
            double resultado;
            String escalaOrigem, escalaDestino;
            
            if (escala == 'C') {
                // Conversão de Celsius para Fahrenheit: F = (C × 9/5) + 32
                resultado = (temperatura * 9/5) + 32;
                escalaOrigem = "Celsius";
                escalaDestino = "Fahrenheit";
            } else {
                // Conversão de Fahrenheit para Celsius: C = (F - 32) × 5/9
                resultado = (temperatura - 32) * 5/9;
                escalaOrigem = "Fahrenheit";
                escalaDestino = "Celsius";
            }
            
            // Exibindo o resultado
            System.out.println("\n--- RESULTADO DA CONVERSÃO ---");
            System.out.printf("Temperatura em %s: %.2f°%s%n", 
                escalaOrigem, temperatura, escala == 'C' ? "C" : "F");
            System.out.printf("Temperatura em %s: %.2f°%s%n", 
                escalaDestino, resultado, escala == 'C' ? "F" : "C");
        }
        
        scanner.close();
    }
}