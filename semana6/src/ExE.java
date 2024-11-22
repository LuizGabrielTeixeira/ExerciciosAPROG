import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
        algarismosPosicoesComuns();
    }

    public static void algarismosPosicoesComuns() {
        Scanner scanner = new Scanner(System.in);

        int limiteParesLidos = scanner.nextInt();
        int digitosEmComum;
        int validadorDigitosEmComum = 0;
        int numeroPrintadoUm = 0;
        int numeroPrintadoDois = 0;

        if (limiteParesLidos > 0) {
            for (int i = 0; i < limiteParesLidos; i++) {
                int numero1 = scanner.nextInt();
                int numero2 = scanner.nextInt();

                digitosEmComum = verificarDigitos(numero1, numero2);


                if (digitosEmComum >= validadorDigitosEmComum) {
                    validadorDigitosEmComum = digitosEmComum;
                    numeroPrintadoUm = numero1;
                    numeroPrintadoDois = numero2;
                }
            }

            if (validadorDigitosEmComum == 0) {
                System.out.println("no results");
            } else {
                System.out.printf("%d/%d\n", numeroPrintadoUm, numeroPrintadoDois);
            }

            scanner.close();
        } else {
            System.out.println("no results");
        }
        scanner.close();
    }

    public static int verificarDigitos(int numero1, int numero2) {
        int digitosEmComum = 0;

        while (numero1 > 0 && numero2 > 0) {
            int digito1 = numero1 % 10;
            int digito2 = numero2 % 10;

            if (digito1 == digito2) {
                digitosEmComum++;
            }

            numero1 /= 10;
            numero2 /= 10;
        }
        return digitosEmComum;
    }
}
