import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números inteiros:");
        
        // Lendo os três números
        System.out.print("Primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Terceiro número: ");
        int num3 = scanner.nextInt();
        
        // Encontrando o menor número
        int menor = num1;
        
        if (num2 < menor) {
            menor = num2;
        }
        
        if (num3 < menor) {
            menor = num3;
        }
        
        // Exibindo o resultado
        System.out.println("MENOR = " + menor);
        
        scanner.close();
    }
}