import javax.security.auth.login.AccountLockedException;
import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
        frequenciaNotas();
    }

    public static void frequenciaNotas(){
        int[] listaNotas = lerNotas();
        int[] listaFrequencia = determinarFrequencias(listaNotas);

        for (int i = 0; i < listaFrequencia.length; i++) {
            System.out.printf("%d: %d\n", i, listaFrequencia[i]);
        }
    }

    public static int[] lerNotas(){
        Scanner scanner = new Scanner(System.in);
        int[] notas;
        int quantidade = scanner.nextInt();

        notas = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            notas[i] = scanner.nextInt();
        }

        scanner.close();
        return notas;
    }

    public static int[] determinarFrequencias(int[] notas){
        int[] frequencias = new int[21];
        int contador = 0;

        for (int i = 0; i < frequencias.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (notas[j] == i) {
                    contador++;
                    frequencias[i] = contador;
                }
            }
            contador = 0;
        }

        return frequencias;
    }
}
