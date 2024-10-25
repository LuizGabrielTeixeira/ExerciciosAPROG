import java.util.Scanner;

public class ExK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLimite = scanner.nextInt();

        int divisor;
        int nDivisores;
        int numerosPrimos = 2;

        if (numeroLimite >= 2) {
            for (int i = numerosPrimos; i <= numeroLimite; i++) {
                divisor = 1;
                nDivisores = 0;

                for (int j = divisor; j <= i; j++) {
                    if (i % j == 0) {
                        nDivisores++;
                    }
                }
                if (nDivisores == 2) {
                    System.out.printf("%d\n", i);
                }
            }
        }

        else {
            System.out.println();
        }
        scanner.close();
    }
}