import java.util.Scanner;

public class ExK {
    public static void main(String[] args) {
        imprimirSorteOuAzar();
    }

    private static void imprimirSorteOuAzar() {
        Scanner scanner = new Scanner(System.in);
        int facesDados = scanner.nextInt();

        if (verificarFacesInputadas(facesDados)) {
            System.out.printf("points=%d\n", calcularFaces(facesDadosInvertidos(facesDados)));
        }

        scanner.close();
    }

    public static boolean verificarFacesInputadas(int numero) {
        int digito;
        boolean facesValidas = true;

        while (numero > 0) {
            digito = numero % 10;
            numero /= 10;

            if (digito > 6 || digito < 1) {
                facesValidas = false;
            }
        }

        return facesValidas;
    }

    private static int calcularFaces(int numero) {
        int digito1;
        int digito2 = numero % 10;
        int soma = digito2;
        numero /= 10;

        for (int i = numero; i > 0; i /= 10) {
            digito1 = digito2;
            digito2 = i % 10;

            if (digito2 == digito1) {
                if (soma < 0) {
                    soma = soma + (digito2 * -1);
                } else {
                    soma = (soma * -1) + (digito2 * -1);
                }
            } else {
                soma = soma + digito2;
            }
        }
        return soma;
    }

    public static int facesDadosInvertidos(int numero) {
        int facesInputadasInvertidas = 0;
        int digito;

        while (numero > 0) {
            digito = numero % 10;
            facesInputadasInvertidas = facesInputadasInvertidas * 10 + digito;
            numero /= 10;
        }

        return facesInputadasInvertidas;
    }
}
