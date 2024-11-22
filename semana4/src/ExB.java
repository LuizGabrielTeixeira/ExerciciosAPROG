import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado = scanner.nextInt();
        int digito;
        int somaPares = 0;

        if (numeroDigitado >= 0) {

            while (numeroDigitado > 0) {
                digito = numeroDigitado % 10;
                if (digito % 2 == 0) {
                    somaPares = somaPares + digito;
                }
                numeroDigitado = numeroDigitado / 10;
            }
            System.out.println(somaPares);
        }
        else {
            scanner.close();
        }
        scanner.close();
    }
}