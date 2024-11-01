import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {
        imprimirTripla();
    }

    public static void imprimirTripla() {
        Scanner scanner = new Scanner(System.in);

        int numeroCalcularTriplas = scanner.nextInt();
        int printarTriplas;

        if (numeroCalcularTriplas <= 100) {
            printarTriplas = calcularTriplas(numeroCalcularTriplas);
            visualizarTriplas(printarTriplas);

        }
        scanner.close();
    }

    private static void visualizarTriplas(int numero) {
        System.out.printf("triples=%d\n", numero);
    }

    public static int calcularTriplas(int numeroInputado) {
        int numero1 = numeroInputado - 1;
        int numero2;
        int numero3;
        int contadorTriplas = 0;

        for (int a = numero1; a > 0 ; a--) {
            numero2 = a;
            for (int b = numero2; b > 0; b--) {
                numero3 = b;
                for (int c = numero3; c > 0; c--) {
                    if (a + b + c == numeroInputado) {
                        contadorTriplas++;
                        System.out.printf("%d + %d + %d\n", a, b, c);
                    }
                }
            }
        }

        return contadorTriplas;
    }
}