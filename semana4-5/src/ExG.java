package semana4_5;

import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();

        int divisor = 1;
        int nDivisores = 0;
        while (divisor <= numeroDigitado) {
            if (numeroDigitado % divisor == 0) {
                System.out.println(divisor);
                nDivisores++;
                divisor++;
            }

            divisor++;

        }
        System.out.println("(" + nDivisores + ")");
    }
}
