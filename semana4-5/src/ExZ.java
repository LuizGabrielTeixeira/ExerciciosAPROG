import java.util.Scanner;

public class ExZ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //porcentagem dos pares e maior digito impar

        int numeroInserido = scanner.nextInt();
        int digito;
        int quantidadeTotal = 0;
        int quantidadePares = 0;
        int maiorImpar = 0;
        float porcentagemPares;

        do{
            digito = numeroInserido % 10;

            if(digito % 2 == 0){
                quantidadePares++;
                quantidadeTotal++;
            }
            else {
                if(digito > maiorImpar){
                    maiorImpar = digito;
                }
                quantidadeTotal++;
            }
            numeroInserido = numeroInserido / 10;

        }while(numeroInserido > 0);

        porcentagemPares = (float) (quantidadePares) / (quantidadeTotal) * 100;
        System.out.printf("%.2f%%\n", porcentagemPares);

        if (maiorImpar == 0){
            System.out.println("no odd digits");
        }
        else {
            System.out.printf("%d\n", maiorImpar);
        }

        scanner.close();
    }
}
