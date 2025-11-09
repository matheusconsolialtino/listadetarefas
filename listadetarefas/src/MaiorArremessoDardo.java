import java.util.Locale;
import java.util.Scanner;

public class MaiorArremessoDardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ARREMESSO DE DARDO ===");
        
        // Lendo as três tentativas
        System.out.print("Digite a distância do 1º lançamento (metros): ");
        double tentativa1 = scanner.nextDouble();
        
        System.out.print("Digite a distância do 2º lançamento (metros): ");
        double tentativa2 = scanner.nextDouble();
        
        System.out.print("Digite a distância do 3º lançamento (metros): ");
        double tentativa3 = scanner.nextDouble();
        
        // Encontrando a maior distância
        double maiorDistancia = tentativa1;
        
        if (tentativa2 > maiorDistancia) {
            maiorDistancia = tentativa2;
        }
        
        if (tentativa3 > maiorDistancia) {
            maiorDistancia = tentativa3;
        }
        
        // Exibindo os resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("1ª tentativa: %.2f metros%n", tentativa1);
        System.out.printf("2ª tentativa: %.2f metros%n", tentativa2);
        System.out.printf("3ª tentativa: %.2f metros%n", tentativa3);
        System.out.printf("MAIOR DISTÂNCIA: %.2f metros%n", maiorDistancia);
        
        scanner.close();
    }
}