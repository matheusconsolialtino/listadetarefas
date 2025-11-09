import java.util.Locale;
import java.util.Scanner;

public class ClassificacaoGlicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de glicose no sangue (mg/dL): ");
        double glicose = scanner.nextDouble();
        
        System.out.println("\n--- CLASSIFICAÇÃO GLICÊMICA ---");
        System.out.printf("Valor medido: %.1f mg/dL%n", glicose);
        
        if (glicose <= 100) {
            System.out.println("Classificação: NORMAL");
        } else if (glicose <= 140) {
            System.out.println("Classificação: ELEVADO");
        } else {
            System.out.println("Classificação: DIABETES");
        }
        
        scanner.close();
    }
}