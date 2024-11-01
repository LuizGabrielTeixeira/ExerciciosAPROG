package semana4_5;

import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = scanner.nextInt();
        int prodImpar = 1;
        boolean temImpar = false;


        while (numeroDigitado > 0) {
            int digito = numeroDigitado % 10;
            if (digito % 2 != 0) {
                prodImpar = prodImpar * digito;
                temImpar = true;
            }
            numeroDigitado /= 10;
        }

        if (!temImpar) {
            System.out.println("no odd digits");
        }

        else {
            System.out.println(prodImpar);

        }
    }
}