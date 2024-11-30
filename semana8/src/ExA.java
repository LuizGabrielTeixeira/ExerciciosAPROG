import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        imprimirMediaMaisReprovados();
    }

    private static void imprimirMediaMaisReprovados() {
        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = scanner.nextInt();
        double [] totalNotas = new double[quantidadeAlunos];
        double nota;

        for (int a = 0; a < quantidadeAlunos; a++) {
            nota = scanner.nextDouble();
            totalNotas[a] = nota;
        }

        double medias = calcularMedia(totalNotas);
        int reprovados = reprovados(totalNotas);

        System.out.printf("average=%.1f\nfailures=%d\n", medias, reprovados);

        scanner.close();
    }

    private static int reprovados(double[] totalNotas) {
        int quantidadeAlunos = totalNotas.length;
        int reprovados = 0;

        for (int b = 0; b < quantidadeAlunos; b++) {
            if (totalNotas[b] < 10) {
                reprovados++;
            }
        }

        return reprovados;
    }

    private static double calcularMedia(double[] totalNotas) {
        double media;
        double soma = 0;
        int quantidadeAlunos = totalNotas.length;

        for (int c = 0; c < quantidadeAlunos; c++) {
            soma += totalNotas[c];
        }

        media = soma/quantidadeAlunos;

        return media;
    }
}
