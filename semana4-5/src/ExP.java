import java.util.Scanner;

public class ExP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInserido = scanner.nextInt();
        int numeroInseridoOriginal;
        int numeroAuxiliar;
        int digitoAnalisado;
        int digitoVerificador;
        int posicao1;
        int posicao2;

        do {
            posicao1 = 1;
            numeroInseridoOriginal = numeroInserido;
            numeroAuxiliar = numeroInserido;
            boolean repetiu = false;

            while (numeroAuxiliar > 0 && !repetiu) {

                digitoAnalisado = numeroAuxiliar % 10;
                posicao2 = posicao1 + 1;
                numeroInserido = numeroAuxiliar / 10;


                while (numeroInserido > 0 && !repetiu) {
                    digitoVerificador = numeroInserido % 10;

                    if (digitoAnalisado == digitoVerificador) {
                        System.out.printf("%d : digit (%d) repeated in positions (%d) and (%d)\n", numeroInseridoOriginal, digitoAnalisado, posicao1, posicao2);
                        repetiu = true;
                    }
                    posicao2++;
                    numeroInserido = numeroInserido / 10;

                }

                posicao1++;
                numeroAuxiliar = numeroAuxiliar / 10;
            }

            numeroInserido = scanner.nextInt();
        } while (numeroInserido > 0);

        scanner.close();
    }
}