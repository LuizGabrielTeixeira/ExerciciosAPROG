import java.util.Scanner;

public class ExH {
    static final int TENTATIVAS = 5;

    public static void main(String[] args) {
        impressorPalindromo();
    }

    public static void impressorPalindromo() {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int qtdTentativas = 1;

        while (!verificarPalindromo(numero) && qtdTentativas < TENTATIVAS) {
            numero = scanner.nextInt();
            qtdTentativas++;
        }

        if (qtdTentativas == TENTATIVAS){
            System.out.println("attempts exceeded");
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(int numero) {
        boolean palindromo = false;
        int numeroInvertido = 0;

        for (int i = numero; i > 0; i /= 10) {
            int digito = i % 10;
            numeroInvertido = numeroInvertido * 10 + digito;

        }

        if (numero == numeroInvertido) {
            System.out.println("palindrome");
            palindromo = true;
        }

        return palindromo;
    }
}
