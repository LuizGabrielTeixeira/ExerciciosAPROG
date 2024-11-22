import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
        combinacoesPermutacoes();
    }

    public static void combinacoesPermutacoes() {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.print("");
        } else {
            combinations(numero1, numero2);
            permutations(numero1, numero2);

            System.out.printf("C(%d,%d)=%d\n", numero1, numero2, combinations(numero1, numero2));
            System.out.printf("P(%d,%d)=%d\n", numero1, numero2, permutations(numero1, numero2));
        }

        scanner.close();
    }

    public static int factorial(int numeroFatorial) {
        int fatorial;

        for (fatorial = 1; numeroFatorial > 1; numeroFatorial--) {
            fatorial *= numeroFatorial;
        }

        return fatorial;
    }

    public static int combinations(int numero1, int numero2) {
        int combinacoes;

        combinacoes = factorial(numero1) / (factorial(numero2) * factorial(numero1 - numero2));

        return combinacoes;
    }

    public static int permutations(int numero1, int numero2) {
        int permutacoes;

        permutacoes = factorial(numero1) / factorial(numero1 - numero2);

        return permutacoes;
    }
}
