package semana6;

import java.util.Scanner;

public class ExA {
    static final int limiteNumerosLido = 5;

    public static void main(String[] args) {
        calcularMedia();
    }

    public static int quantidadeDigitos(int numero) {
        int quantidadeDigitos = 1;

        while (numero > 9) {
            numero = numero / 10;
            quantidadeDigitos++;
        }

        return quantidadeDigitos;
    }

    public static void calcularMedia() {
        Scanner scanner = new Scanner(System.in);
        int limiteDigitos = scanner.nextInt();
        int numero = scanner.nextInt();
        int quantidadeNumeros = 0;
        int soma = 0;
        double media;

        while (quantidadeDigitos(numero) < limiteDigitos && quantidadeNumeros < limiteNumerosLido) {
            soma = soma + numero;
            quantidadeNumeros++;

            if (quantidadeNumeros < limiteNumerosLido) {
                numero = scanner.nextInt();
            }
        }

        media = (double) soma / quantidadeNumeros;

        if (quantidadeNumeros == 0) {
            media = 0;
        }


        System.out.printf("%.2f\n", media);
    }
}