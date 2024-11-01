import java.util.Scanner;

public class ExM {
    public static void main(String[] args) {
        imprimir();
    }

    private static void imprimir() {
        Scanner scanner = new Scanner(System.in);

        int numeroInputado = scanner.nextInt();

        int total = 0;
        int totalPositivos = 0;
        int totalNegativos = 0;
        int totalNaoRepetidos = 0;

        if (numeroInputado != 0) {
            while (numeroInputado != 0) {
                total++;

                if (numeroInputado > 0) {
                    totalPositivos++;
                    if (!digitosRepetidos(numeroInputado)) {
                        totalNaoRepetidos++;
                        System.out.printf("%d\n", numeroInputado);

                    }
                }

                if (numeroInputado < 0) {
                    totalNegativos++;
                    if (!digitosRepetidos(numeroInputado)) {
                        totalNaoRepetidos++;
                        System.out.printf("%d\n", numeroInputado);

                    }
                }

                numeroInputado = scanner.nextInt();
            }

            System.out.printf("negatives: %.2f%%\n", calcularPorcentagem(total, totalNegativos));
            System.out.printf("positives: %.2f%%\n", calcularPorcentagem(total, totalPositivos));
            System.out.printf("with unique digits: %.2f%%\n", calcularPorcentagem(total, totalNaoRepetidos));
        }
        scanner.close();
    }

    private static boolean digitosRepetidos(int numero) {
        boolean repetido = false;
        int digito;
        int digitoVerificador;

        if (numero < 0) {
            numero = numero * -1;
        }

        for (int i = numero; i > 0; i /= 10) {
            digito = i % 10;
            numero /= 10;

            for (int j = numero; j > 0; j /= 10) {
                digitoVerificador = j % 10;
                if (digito == digitoVerificador) {
                    repetido = true;
                }
            }
        }


        return repetido;
    }

    private static double calcularPorcentagem(int total, int valor) {
        double porcentagem;

        porcentagem = (double) valor / total * 100;

        return porcentagem;
    }
}
