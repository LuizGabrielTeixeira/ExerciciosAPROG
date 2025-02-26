import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        imprimirMenoresElementos();
    }

    public static void imprimirMenoresElementos() {
        Scanner scanner = new Scanner(System.in);

        int[] elementos = new int[100];
        int numero = scanner.nextInt();
        int quantidade = 0;
        int minimo;
        int ocorrencia;

        if (numero > 0) {
            elementos[0] = numero;

            for (int i = 1; i < elementos.length && numero > 0; i++) {
                quantidade++;
                numero = scanner.nextInt();
                elementos[i] = numero;
            }

            minimo = lerMinimo(elementos, quantidade);
            ocorrencia = verOcorrencias(minimo, elementos);

            System.out.printf("min=%d\noccurrences=%d", minimo, ocorrencia);

        } else {
            System.out.println();
        }
        scanner.close();
    }

    private static int verOcorrencias(int numeroMin, int[] elementos) {
        int ocorrencia = 0;
        int quantidadeElementos = elementos.length;

        for (int a = 0; a < quantidadeElementos; a++) {
            if (elementos[a] == numeroMin) {
                ocorrencia++;
            }
        }

        return ocorrencia;
    }

    public static int lerMinimo(int[] elementos,int quantidade) {
        int minimo = elementos[0];

        for (int b = 1; b < quantidade; b++) {
            if ((elementos[b] < minimo) && (elementos[b] > 0)) {
                    minimo = elementos[b];
            }
        }

        return minimo;
    }
}
