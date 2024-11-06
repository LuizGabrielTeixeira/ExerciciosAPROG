import java.util.Scanner;

public class ExY {
    public static void main(String[] args) {
        imprimir();
    }

    public static void imprimir() {
        Scanner scanner = new Scanner(System.in);

        int limiteInferior = readPositiveValue(scanner);
        int limiteSuperior = readPositiveValue(scanner);
        int limiteAuxiliar;

        if (limiteInferior > limiteSuperior) {
            limiteAuxiliar = limiteInferior;
            limiteInferior = limiteSuperior;
            limiteSuperior = limiteAuxiliar;
        }

        showTablesInRange(limiteInferior, limiteSuperior);
        scanner.close();
    }

    public static int readPositiveValue(Scanner scanner) {
        int numeroValido;

        do {
            numeroValido = scanner.nextInt();
        } while (numeroValido <= 0);

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
