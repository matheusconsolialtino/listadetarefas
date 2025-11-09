import java.util.Locale;
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os coeficientes da equação do segundo grau (ax² + bx + c = 0):");
        
        // Lendo os coeficientes
        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();
        
        // Calculando o delta
        double delta = b * b - 4 * a * c;
        
        // Verificando as condições
        if (a == 0) {
            System.out.println("Esta não é uma equação do segundo grau (a = 0).");
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            // Raiz única (duas raízes iguais)
            double x = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: x = %.4f%n", x);
        } else {
            // Duas raízes reais distintas
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.printf("As raízes da equação são:%n");
            System.out.printf("x1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        }
        
        scanner.close();
    }
}