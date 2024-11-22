import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        graficoColocacoes();
    }

    public static void graficoColocacoes() {
        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = scanner.nextInt();
        int numeroDisciplinas = scanner.nextInt();
        int aprovados;
        String nomeDisciplina;

        for (int i = 0; i < numeroDisciplinas; i++) {
            nomeDisciplina = scanner.next();
            aprovados = scanner.nextInt();
            int reprovados = quantidadeAlunos - aprovados;

            System.out.printf("Subject: %s\n", nomeDisciplina);
            System.out.print("- Approved: ");
            printarAprovados(aprovados);
            System.out.print("\n- Failed: ");
            printarReprovados(reprovados);
            System.out.println();
        }
        scanner.close();
    }

    public static void printarAprovados(int aprovados) {

        for (int g = 0; g < aprovados; g++) {
            System.out.print("*");
        }
    }

    public static void printarReprovados(int reprovados) {

        for (int j = 0; j < reprovados; j++) {
            System.out.print("*");
        }
    }
}