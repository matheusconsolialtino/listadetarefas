import java.util.Locale;
import java.util.Scanner;

public class CalculoContaTelefone {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Constantes do plano
        final double VALOR_BASE = 50.00;
        final int MINUTOS_INCLUSOS = 100;
        final double VALOR_EXCEDENTE = 2.00;
        
        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutosConsumidos = scanner.nextInt();
        
        double valorTotal;
        
        if (minutosConsumidos <= MINUTOS_INCLUSOS) {
            // Dentro da franquia - paga apenas o valor base
            valorTotal = VALOR_BASE;
        } else {
            // Excedeu a franquia - calcula minutos excedentes
            int minutosExcedentes = minutosConsumidos - MINUTOS_INCLUSOS;
            double valorExcedente = minutosExcedentes * VALOR_EXCEDENTE;
            valorTotal = VALOR_BASE + valorExcedente;
        }
        
        // Exibindo o resultado
        System.out.printf("Minutos consumidos: %d%n", minutosConsumidos);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        
        scanner.close();
    }
}