import java.util.Scanner;

public class VerificadorMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VERIFICADOR DE MÚLTIPLOS ===");
        
        // Lendo os dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        // Verificando se são múltiplos (em qualquer ordem)
        boolean saoMultiplos = false;
        String mensagem;
        
        if (numero1 == 0 || numero2 == 0) {
            // Tratamento especial para zero
            if (numero1 == 0 && numero2 == 0) {
                mensagem = "Ambos são zero. Tecnicamente, zero é múltiplo de zero.";
            } else if (numero1 == 0) {
                mensagem = "Zero é múltiplo de qualquer número, incluindo " + numero2 + ".";
            } else {
                mensagem = "Zero é múltiplo de qualquer número, incluindo " + numero1 + ".";
            }
            saoMultiplos = true;
        } else if (numero1 % numero2 == 0) {
            mensagem = numero1 + " é múltiplo de " + numero2 + ".";
            saoMultiplos = true;
        } else if (numero2 % numero1 == 0) {
            mensagem = numero2 + " é múltiplo de " + numero1 + ".";
            saoMultiplos = true;
        } else {
            mensagem = numero1 + " e " + numero2 + " NÃO são múltiplos um do outro.";
        }
        
        // Exibindo o resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Números informados: " + numero1 + " e " + numero2);
        System.out.println(mensagem);
        
        // Explicação matemática
        if (saoMultiplos && !(numero1 == 0 || numero2 == 0)) {
            if (numero1 % numero2 == 0) {
                int quociente = numero1 / numero2;
                System.out.println("Explicação: " + numero1 + " ÷ " + numero2 + " = " + quociente + " (divisão exata)");
            } else {
                int quociente = numero2 / numero1;
                System.out.println("Explicação: " + numero2 + " ÷ " + numero1 + " = " + quociente + " (divisão exata)");
            }
        }
        
        scanner.close();
    }
}
