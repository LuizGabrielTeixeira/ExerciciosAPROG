import java.util.Scanner;

public class ExY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroInserido = scanner.nextInt();
        int divisor = 1;
        int divisoresMultiplos3 = 0;

        for (int i = divisor; i <= numeroInserido; i++){
            if (numeroInserido % i == 0){
                if (i % 3 == 0){
                    System.out.printf("%d\n", i);
                    divisoresMultiplos3++;
                }
            }
        }

        if (divisoresMultiplos3 == 0){
            System.out.println("without dividers multiples of 3");
        }

        scanner.close();
    }
}
