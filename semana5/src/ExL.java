import java.util.Scanner;

public class ExL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLimite = scanner.nextInt();

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
