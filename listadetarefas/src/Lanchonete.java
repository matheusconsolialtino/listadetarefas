import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Exibindo o cardápio
        System.out.println("=== LANCHONETE ===");
        System.out.println("Código | Produto       | Preço");
        System.out.println("-------+---------------+--------");
        System.out.println("   1   | Cachorro Quente| R$ 5.00");
        System.out.println("   2   | X-Salada       | R$ 3.50");
        System.out.println("   3   | X-Bacon        | R$ 4.80");
        System.out.println("   4   | Torrada        | R$ 8.90");
        System.out.println("   5   | Refrigerante   | R$ 7.32");
        System.out.println();
        
        // Lendo os dados do pedido
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        
        // Calculando o valor total
        double precoUnitario;
        String nomeProduto;
        
        switch (codigo) {
            case 1:
                precoUnitario = 5.00;
                nomeProduto = "Cachorro Quente";
                break;
            case 2:
                precoUnitario = 3.50;
                nomeProduto = "X-Salada";
                break;
            case 3:
                precoUnitario = 4.80;
                nomeProduto = "X-Bacon";
                break;
            case 4:
                precoUnitario = 8.90;
                nomeProduto = "Torrada";
                break;
            case 5:
                precoUnitario = 7.32;
                nomeProduto = "Refrigerante";
                break;
            default:
                System.out.println("Código inválido! Digite um código entre 1 e 5.");
                scanner.close();
                return;
        }
        
        double valorTotal = precoUnitario * quantidade;
        
        // Exibindo o resultado
        System.out.println("\n--- NOTA FISCAL ---");
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Código: %d%n", codigo);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("VALOR TOTAL: R$ %.2f%n", valorTotal);
        
        scanner.close();
    }
}