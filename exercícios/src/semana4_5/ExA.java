package semana4_5;

import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = scanner.nextInt();
        int somaPares = 0;

        while (numeroDigitado > 0) {
            int digito = numeroDigitado % 10;
            if (digito % 2 == 0) {
                somaPares = somaPares + digito;
            }
            numeroDigitado /= 10;
        }

        System.out.println(somaPares);

    }
}
