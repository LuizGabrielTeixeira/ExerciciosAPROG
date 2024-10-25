package semana4_5;

import java.util.Scanner;

public class ExO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int restricoes = scanner.nextInt();
        int quantidadePizzas = scanner.nextInt();
        int digitoRestricoes;
        int restricoesCopia = restricoes;
        int digitoPizza;
        int sugestao = 1;
        boolean repetiu;

        for (int i = 0; i < quantidadePizzas; i++) {
            int pizza = scanner.nextInt();
            int pizzaOriginal = pizza;
            repetiu = false;

            while (pizza > 0) {
                digitoPizza = pizza % 10;
                restricoes = restricoesCopia;

                if (restricoes == 0 && digitoPizza == 0) {
                    repetiu = true;

                }

                while (restricoes > 0) {
                    digitoRestricoes = restricoes % 10;

                    if (digitoPizza == digitoRestricoes) {
                        repetiu = true;
                    }

                    restricoes = restricoes / 10;
                }

                pizza = pizza / 10;

            }
            if (!repetiu) {
                System.out.printf("Suggestion #%d:%d\n", sugestao, pizzaOriginal);
                sugestao++;
            }
        }
        scanner.close();
    }
}
