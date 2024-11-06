import java.util.Scanner;

public class ExH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();


        int divisor = 1;
        int nDivisores = 0;
        while (divisor <= numeroDigitado) {
            if (numeroDigitado % divisor == 0) {
                nDivisores++;
                divisor++;
            } else {
                divisor++;
            }
        }
        if (nDivisores == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}