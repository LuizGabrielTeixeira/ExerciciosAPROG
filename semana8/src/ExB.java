import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        imprimirMenoresElementos();
    }

    public static void imprimirMenoresElementos() {
        Scanner scanner = new Scanner(System.in);

        int[] elementos;
        int numero = scanner.nextInt();
        int minimo;
        int ocorrencia;
        int quantidadeElementos = 1;

        if (numero > 0) {
            elementos = new int[quantidadeElementos];
            elementos[0] = numero;
            numero = scanner.nextInt();

            for (int i = 1; numero < 0; i++) {
                quantidadeElementos++;
                elementos = new int [quantidadeElementos];
                elementos[i] = numero;
                numero = scanner.nextInt();
            }

            minimo = lerMinimo(elementos);
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

    public static int lerMinimo(int[] elementos) {
        int limite = elementos.length;
        int minimo = elementos[0];

        for (int b = 1; b < limite; b++) {
            if (elementos[b] < minimo) {
                minimo = elementos[b];
            }
        }

        return minimo;
    }
}
