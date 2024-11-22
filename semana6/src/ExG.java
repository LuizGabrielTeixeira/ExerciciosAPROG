import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {
        impressoraArmstrong();
    }

    public static void impressoraArmstrong() {
        Scanner scanner = new Scanner(System.in);

        int verificarAte = scanner.nextInt();

        for (int i = 0; i <= verificarAte; i++) {
            verificarNumero(i);
        }

        scanner.close();
    }

    public static void verificarNumero(int numero) {

        int qtdeDigitos = contadoraDigitos(numero);
        int soma = 0;
        int digitoNumero;
        int somaArmstrong;

        if (qtdeDigitos == 1) {
            System.out.printf("%d\n", numero);
        } else {
            for (int j = numero; j > 0; j /= 10) {
                digitoNumero = j % 10;
                somaArmstrong = (int) Math.pow(digitoNumero, qtdeDigitos);
                soma = soma + somaArmstrong;
            }

            if (soma == numero) {
                System.out.printf("%d\n", numero);
            }
        }
    }

    public static int contadoraDigitos(int numero) {
        int qtdeDigitos = 1;

        while (numero > 9) {
            numero = numero / 10;
            qtdeDigitos++;
        }
        return qtdeDigitos;
    }
}
