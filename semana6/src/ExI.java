import java.util.Scanner;

public class ExI {
    public static void main(String[] args) {
        impressoraFibonacci();
    }

    public static void impressoraFibonacci() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        verificarFibonacci(numero);

        scanner.close();
    }

    public static void verificarFibonacci(int numero) {

        int primeiroTermo = 0;
        int segundoTermo = 1;
        int terceiroTermo = 0;

        if (numero == 0 || numero == 1) {
            System.out.println("is a Fibonacci number");

        } else {
            while (segundoTermo < numero) {
                terceiroTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = terceiroTermo;

            }
            if (terceiroTermo == numero) {
                System.out.println("is a Fibonacci number");

            } else {

                System.out.println("is not a Fibonacci number");
            }
        }
    }
}
