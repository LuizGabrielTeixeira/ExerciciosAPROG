import java.util.Scanner;

public class ExH {
    public static void main(String[] args) {
        reedSequence();
    }

    public static void reedSequence() {
        Scanner sc = new Scanner(System.in);

        int quantityOfNumbers = sc.nextInt();

        int[] sequence = new int[quantityOfNumbers];

        for (int i = 0; i < quantityOfNumbers; i++) {
            sequence[i] = sc.nextInt();
        }

        reedCommands(sc, sequence);

        sc.close();
    }

    public static void reedCommands(Scanner sc, int[] sequence) {
        String command;

        do {
            command = sc.next();
            if (command.equalsIgnoreCase("right")) {
                rotateRight(sequence);
            } else if (command.equalsIgnoreCase("left")) {
                rotateLeft(sequence);
            }
        } while (!command.equalsIgnoreCase("exit"));
    }

    public static void rotateRight(int[] sequence) {
        int lastNumber = sequence[sequence.length - 1];
        int temporaryNumberA = sequence[0];
        int temporaryNumberB;

        sequence[0] = lastNumber;

        for (int i = 1; i < sequence.length; i++) {
            temporaryNumberB = sequence[i];
            sequence[i] = temporaryNumberA;
            temporaryNumberA = temporaryNumberB;
        }

        for (int i = 0; i < sequence.length; i++) {
            System.out.printf("[%d] ", sequence[i]);
        }
        System.out.println();
    }

    public static void rotateLeft(int[] sequence) {
        int firstNumber = sequence[0];
        int temporaryNumberA = sequence[sequence.length - 1];
        int temporaryNumberB;

        sequence[sequence.length - 1] = firstNumber;

        for (int i = sequence.length -2; i > -1; i--) {
            temporaryNumberB = sequence[i];
            sequence[i] = temporaryNumberA;
            temporaryNumberA = temporaryNumberB;
        }

        for (int i = 0; i < sequence.length; i++) {
            System.out.printf("[%d] ", sequence[i]);
        }
        System.out.println();
    }
}
