package semana4_5;

import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int limite = scanner.nextInt();
        int numeroDigitado;
        int digito;
        int contadorDivisor;
        int contadorDigito;
        int numero;
        float porcentNumero = 0f;
        float maiorPorcent = 0f;

        if (limite > 0) {

            while (limite > 0) {
                numeroDigitado = scanner.nextInt();
                numero = numeroDigitado;
                contadorDivisor = 0;
                contadorDigito = 0;

                while (numero > 0) {
                    digito = numero % 10;

                    if (digito > 0 && numeroDigitado % digito == 0) {
                        contadorDivisor++;
                    }
                    contadorDigito++;

                    numero = numero / 10;
                }

                porcentNumero = (float) contadorDivisor / contadorDigito * 100;

                if (porcentNumero > maiorPorcent) {
                    maiorPorcent = porcentNumero;
                }

                System.out.printf("%.2f%%\n", porcentNumero);

                limite--;
            }

            System.out.printf("(%.2f%%)\n", maiorPorcent);
        }

        scanner.close();
    }
}