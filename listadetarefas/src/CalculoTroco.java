import java.util.Locale;
import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados
        System.out.print("Preço unitário do produto: R$ ");
        double precoUnitario = scanner.nextDouble();
        
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();
        
        System.out.print("Dinheiro recebido: R$ ");
        double dinheiroRecebido = scanner.nextDouble();
        
        // Cálculo do valor total da compra
        double valorTotal = precoUnitario * quantidade;
        
        // Verificação se o dinheiro é suficiente
        if (dinheiroRecebido >= valorTotal) {
            // Calcula e exibe o troco
            double troco = dinheiroRecebido - valorTotal;
            System.out.printf("TROCO = R$ %.2f%n", troco);
        } else {
            // Calcula quanto falta
            double falta = valorTotal - dinheiroRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM R$ %.2f%n", falta);
        }
        
        scanner.close();
    }
}