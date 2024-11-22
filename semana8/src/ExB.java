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

        if (numero > 0){
            elementos = new int[numero];

            for (int i = 0; i < numero; i++) {
                elementos[i] = scanner.nextInt();
            }

            minimo = lerMinimo(elementos);
            ocorrencia = verOcorrencias(minimo, elementos);

            System.out.printf("min=%d\noccurrences=%d\n", minimo, ocorrencia);
        }else {
            System.out.println();
        }

        scanner.close();
    }

    private static int verOcorrencias(int numeroMin, int[] elementos) {
        int ocorrencia = 0;
        int quantidadeElementos = elementos.length;

        for (int a = 0; a < quantidadeElementos; a++){
            if (elementos[a] == numeroMin){
                ocorrencia++;
            }
        }

        return ocorrencia;
    }

    public static int lerMinimo(int[] elementos) {
        int limite = elementos.length;
        int minimo = elementos[0];

        for (int b = 0; b < limite; b++){
            if (elementos[b] < minimo){
                minimo = elementos[b];
            }
        }

        return minimo;
    }
}
