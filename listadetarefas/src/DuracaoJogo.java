import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("⏰ CALCULADORA DE DURAÇÃO DE JOGO ⏰");
        System.out.print("Hora de início: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Hora do término: ");
        int fim = scanner.nextInt();
        
        // Validação
        if (inicio < 0 || inicio > 23 || fim < 0 || fim > 23) {
            System.out.println("❌ Erro: As horas devem estar entre 0 e 23!");
            scanner.close();
            return;
        }
        
        int duracao;
        String periodo;
        
        if (inicio < fim) {
            duracao = fim - inicio;
            periodo = "mesmo dia";
        } else if (inicio > fim) {
            duracao = 24 - inicio + fim;
            periodo = "dia seguinte";
        } else {
            duracao = 24;
            periodo = "24 horas completas";
        }
        
        // Exibindo resultado detalhado
        System.out.println("\n📊 RELATÓRIO DO JOGO");
        System.out.println("┌─────────────────┬──────────┐");
        System.out.printf("│ Início:         │ %4d h   │%n", inicio);
        System.out.printf("│ Término:        │ %4d h   │%n", fim);
        System.out.printf("│ Duração:        │ %4d h   │%n", duracao);
        System.out.printf("│ Período:        │ %-8s │%n", periodo);
        System.out.println("└─────────────────┴──────────┘");
        
        // Informação adicional
        if (duracao == 1) {
            System.out.println("💡 O jogo durou 1 hora.");
        } else if (duracao == 24) {
            System.out.println("🌙 O jogo durou exatamente 24 horas!");
        } else {
            System.out.printf("💡 O jogo começou às %dh e terminou às %dh do %s.%n", 
                inicio, fim, periodo.equals("mesmo dia") ? "mesmo dia" : "dia seguinte");
        }
        
        scanner.close();
    }
}