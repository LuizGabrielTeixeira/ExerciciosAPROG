import java.util.Scanner;

public class ExZ {
    public static void main(String[] args) {
        imprimir();
    }

    private static void imprimir() {
        Scanner scanner = new Scanner(System.in);

        int limiteInferior = scanner.nextInt();
        int limiteSuperior = scanner.nextInt();

        verificarIntervalo(limiteInferior, limiteSuperior);

        scanner.close();
    }

    private static void verificarIntervalo(int limiteInferior, int limiteSuperior) {
        int contador = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (verificarPrimo(i)) {
                if (primoTodoTempo(i)) {
                    System.out.printf("%d\n", i);
                    contador++;
                }
            }
        }
        System.out.printf("(%d)\n", contador);
    }

    private static boolean verificarPrimo(int numero) {
        int divisor = 3;
        int limite = (int) Math.sqrt(numero);

        if ((numero % 2 == 0 && numero != 2) || numero == 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else {
            while (divisor <= limite) {
                if (numero % divisor == 0) {
                    return false;
                }
                divisor += 2;
            }
            return true;
        }
    }

    private static boolean primoTodoTempo(int numero) {
        boolean primoTodoTempo = true;
        int qtdDigitos = 0;
        int multiplicador;

        for (int a = numero; a > 0; a /= 10) {
            qtdDigitos++;
        }

        multiplicador = (int) Math.pow(10, qtdDigitos - 1);

        if (numero % 2 != 0 || numero == 2) {
            for (int b = numero; qtdDigitos > 0; qtdDigitos--) {
                int digito = b % 10;
                b = b / 10;
                b = (digito * multiplicador) + b;

                if (!verificarPrimo(b)) {
                    primoTodoTempo = false;
                }
            }
        } else {
            primoTodoTempo = false;
        }

        return primoTodoTempo;
    }
}