import java.util.Scanner;

public class ExM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroLimite = scanner.nextInt();
        int quantidadeFibonacci = 0;
        int termo1 = 0;
        int termo2 = 1;
        int termo3 = 1;
        int somaAcumulada;
        int numero = 0;


        if (numeroLimite >= 1) {
            for (int i = numero; quantidadeFibonacci < numeroLimite; i++) {

                if (i == 0) {
                    System.out.printf("%d\n", termo1);
                    quantidadeFibonacci++;
                }

                else if (i == 1) {
                    System.out.printf("%d\n", termo2);
                    quantidadeFibonacci++;
                }

                else if (i == 2) {
                    System.out.printf("%d\n", termo3);
                    quantidadeFibonacci++;

                }

                else {
                    somaAcumulada = termo2 + termo3;
                    System.out.printf("%d\n", somaAcumulada);
                    termo2 = termo3;
                    termo3 = somaAcumulada;
                    quantidadeFibonacci++;

                }
            }

        }
        else {
            System.out.printf("");
        }

        scanner.close();
    }
}