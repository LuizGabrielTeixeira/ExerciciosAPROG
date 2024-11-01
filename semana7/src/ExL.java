import java.util.Scanner;

public class ExL {
    public static void main(String[] args) {
        imprimirQuantidadePalavras();
    }

    private static void imprimirQuantidadePalavras() {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();
        int quantidade = contarPalavras(frase);

        System.out.printf("%d\n", quantidade);

        scanner.close();
    }

    private static int contarPalavras(String frase) {
        int quantidadePalavras = 0;
        boolean palavra = false;
        int fimDaFrase = frase.length() - 1;

        for (int i = 0; i < frase.length(); i++) {
            char caractereAtual = frase.charAt(i);

            if (!Character.isSpaceChar(frase.charAt(i)) && i != fimDaFrase) {
                palavra = true;
            } else if (Character.isSpaceChar(frase.charAt(i)) && palavra) {
                quantidadePalavras++;
                palavra = false;
            } else if (!Character.isSpaceChar(frase.charAt(i)) && i == fimDaFrase) {
                quantidadePalavras++;
            }
        }

        return quantidadePalavras;
    }
}