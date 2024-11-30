import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        sequenciaCrescente();
    }

    public static void sequenciaCrescente() {
        int[] listaNumeros = lerNumeros();
        boolean crescente = verificarCrescente(listaNumeros);

        System.out.printf("always ascending = %s", crescente);
    }

    public static int[] lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        int[] lista;
        int quantidadeNumeros = scanner.nextInt();

        lista = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            lista[i] = scanner.nextInt();
        }

        return lista;
    }

    public static boolean verificarCrescente(int[] numeros) {
        boolean crescente = true;
        int quantidadeNumeros = numeros.length;
        int primeiroNumero = numeros[0];

        for (int i = 1; i < quantidadeNumeros; i++) {
            if (numeros[i] <= primeiroNumero) {
                crescente = false;
            }
            primeiroNumero = numeros[i];
        }

        return crescente;
    }
}
