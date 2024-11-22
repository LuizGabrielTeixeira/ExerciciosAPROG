import java.util.Scanner;

public class ExN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInserido = scanner.nextInt();
        int verificarCrescente;
        int digito;
        int verificarDigitoCrescente;
        int parametroUm;
        int numeroInseridoAuxiliar;


        if (numeroInserido >= 0) {

            while (numeroInserido >= 0) {
                verificarCrescente = numeroInserido;
                numeroInserido = scanner.nextInt();
                numeroInseridoAuxiliar = numeroInserido;
                parametroUm = 1;

                while (numeroInseridoAuxiliar > 0) {
                    digito = numeroInseridoAuxiliar % 10;
                    verificarDigitoCrescente = digito;
                    numeroInseridoAuxiliar = numeroInseridoAuxiliar / 10;
                    digito = numeroInseridoAuxiliar % 10;

                    if (digito < verificarDigitoCrescente) {
                        parametroUm = parametroUm * 1;

                    } else {
                        parametroUm = parametroUm * 0;
                    }
                }

                if (verificarCrescente < numeroInserido && parametroUm == 1) {
                    System.out.printf("%d\n", numeroInserido);
                }
            }
        } else {
            scanner.close();
        }
        scanner.close();
    }
}
