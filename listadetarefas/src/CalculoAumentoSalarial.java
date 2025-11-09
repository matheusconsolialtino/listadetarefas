import java.util.Locale;
import java.util.Scanner;

public class CalculoAumentoSalarial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("📊 CÁLCULO DE REAJUSTE SALARIAL");
        System.out.println("\n📈 TABELA DE AUMENTOS:");
        System.out.println("┌─────────────────────────────────┬──────────┐");
        System.out.println("│ Faixa Salarial                  │ Aumento  │");
        System.out.println("├─────────────────────────────────┼──────────┤");
        System.out.println("│ Até R$ 1000.00                 │   20%    │");
        System.out.println("│ Acima de R$ 1000.00 até 3000.00│   15%    │");
        System.out.println("│ Acima de R$ 3000.00 até 8000.00│   10%    │");
        System.out.println("│ Acima de R$ 8000.00            │    5%    │");
        System.out.println("└─────────────────────────────────┴──────────┘");
        
        System.out.print("\n💵 Digite o salário atual: R$ ");
        double salario = scanner.nextDouble();
        
        // Validação do salário
        if (salario <= 0) {
            System.out.println("❌ Salário inválido! Digite um valor positivo.");
            scanner.close();
            return;
        }
        
        // Determinando a faixa e porcentagem de aumento
        double percentual;
        String faixa;
        
        if (salario <= 1000.00) {
            percentual = 20.0;
            faixa = "Até R$ 1000.00";
        } else if (salario <= 3000.00) {
            percentual = 15.0;
            faixa = "Acima de R$ 1000.00 até R$ 3000.00";
        } else if (salario <= 8000.00) {
            percentual = 10.0;
            faixa = "Acima de R$ 3000.00 até R$ 8000.00";
        } else {
            percentual = 5.0;
            faixa = "Acima de R$ 8000.00";
        }
        
        // Cálculos
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;
        
        // Exibindo relatório completo
        System.out.println("\n" + "=".repeat(50));
        System.out.println("📋 RELATÓRIO DE REAJUSTE");
        System.out.println("=".repeat(50));
        System.out.printf("Salário atual:    R$ %10.2f%n", salario);
        System.out.printf("Faixa salarial:   %s%n", faixa);
        System.out.printf("Percentual:       %10.1f%%%n", percentual);
        System.out.printf("Valor do aumento: R$ %10.2f%n", aumento);
        System.out.println("-".repeat(50));
        System.out.printf("NOVO SALÁRIO:     R$ %10.2f%n", novoSalario);
        System.out.println("=".repeat(50));
        
        scanner.close();
    }
}