package semana4_5;

import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = scanner.nextInt();
        int digito;
        int numeroAuxiliar;

        if (numeroDigitado >= 0) {

            while (numeroDigitado >= 0) {
                int prodImpar = 1;
                numeroAuxiliar = numeroDigitado;
                if (numeroDigitado == 1) {
                    prodImpar = 1 - 2;
                }

                while (numeroDigitado > 0) {
                    digito = numeroDigitado % 10;
                    numeroDigitado /= 10;

                    if (digito % 2 != 0) {
                        prodImpar = prodImpar * digito;
                    }
                }

                if (prodImpar == 1) {
                    System.out.println("no odd digits");

                } else if (prodImpar == -1) {
                    System.out.println(numeroAuxiliar);

                } else {
                    System.out.println(prodImpar);
                }
                numeroDigitado = scanner.nextInt();
            }
        }
        scanner.close();
    }
}