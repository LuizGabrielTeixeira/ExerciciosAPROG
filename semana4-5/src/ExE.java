package semana4_5;

import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroInseridoBase8 = scanner.nextInt();
        int numeroBase10;
        int ordem;
        int digito;

        do {
            numeroBase10 = 0;
            ordem = 0;

                do {
                    digito = numeroInseridoBase8 % 10;

                    if (digito <= 7) {
                        numeroBase10 += (int) (digito * Math.pow(8, ordem));
                        numeroInseridoBase8 /= 10;
                        ordem++;
                    } else {
                        scanner.close();
                    }
                } while (numeroInseridoBase8 > 0);

                System.out.println(numeroBase10);
                numeroInseridoBase8 = scanner.nextInt();

        } while (numeroInseridoBase8 > 0);

        scanner.close();
    }
}
