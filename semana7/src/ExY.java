import java.util.Scanner;

public class ExY {
    public static void main(String[] args) {
        imprimir();
    }

    public static void imprimir() {
        int limiteInferior = readPositiveValue();
        int limiteSuperior = readPositiveValue();
        int limiteAuxiliar;

        if (limiteInferior > limiteSuperior) {
            limiteAuxiliar = limiteInferior;
            limiteInferior = limiteSuperior;
            limiteSuperior = limiteAuxiliar;
        }

        showTablesInRange(limiteInferior, limiteSuperior);
    }

    public static int readPositiveValue() {
        Scanner scanner = new Scanner(System.in);
        int numeroValido;

        do {
            numeroValido = scanner.nextInt();
        } while (numeroValido <= 0);

        scanner.close();

        return numeroValido;
    }

    public static void showTablesInRange(int limiteInferior, int limiteSuperior) {

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            showTableOfNumber(i);
        }
    }

    public static void showTableOfNumber(int numero) {

        System.out.printf("Multiplication table of %d\n", numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }
}
