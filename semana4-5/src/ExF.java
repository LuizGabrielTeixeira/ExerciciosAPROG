import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();

        int numeroTeste = numeroDigitado;
        if (numeroDigitado != 0) {
            int numeroInverso = 0;

            while (numeroDigitado != 0) {
                numeroInverso = numeroInverso * 10 + numeroDigitado % 10;
                numeroDigitado /= 10;
            }

            if (numeroInverso == numeroTeste) {
                System.out.println("palindrome");
            }

            else {
                System.out.println("not palindrome");
            }
        }
    }
}