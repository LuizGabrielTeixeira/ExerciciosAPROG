import java.util.Scanner;

public class ExL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLimite = scanner.nextInt();
// Um número é perfeito se for natural e for igual à soma
// de todos os seus divisores (excluindo o próprio número).
// Exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6. Ou seja: numeroPerfeito = soma dos divisores (divisor < numero)

        int somaDivisores;
        int divisor;
        int quantidadePerfeitos = 0;
        int numero = 1;

        for (int i = numero; quantidadePerfeitos < numeroLimite; i++) {
            divisor = 1;
            somaDivisores = 0;

            for (int j = divisor; j < i; j++) {
                if (i % j == 0) {
                    somaDivisores = somaDivisores + j;
                }
            }

            if (somaDivisores == i) {
                System.out.printf("%d\n", i);
                quantidadePerfeitos++;
            }
        }

        scanner.close();
    }
}
