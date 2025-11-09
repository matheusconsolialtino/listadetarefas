import java.util.Locale;
import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Leitura das notas
        System.out.print("Digite a nota do primeiro semestre: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota do segundo semestre: ");
        double nota2 = scanner.nextDouble();
        
        // Cálculo da nota final
        double notaFinal = nota1 + nota2;
        
        // Exibição do resultado
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
        
        // Verificação se o aluno foi reprovado
        if (notaFinal < 60.00) {
            System.out.println("REPROVADO");
        }
        
        scanner.close();
    }
}