import java.util.Scanner;

public class ExK {
    public static void main(String[] args) {
        noRepetitions();
    }

    public static void noRepetitions() {
        Scanner sc = new Scanner(System.in);

        int quantityOfNumbers = sc.nextInt();

        int number;
        int[] numbers = new int[quantityOfNumbers];

        for (int i = 0; i < quantityOfNumbers; i++) {
            number = sc.nextInt();
            numbers[i] = number;
        }

        int[] withNoRepetition = checkRepetition(numbers);
        printNumbers(withNoRepetition);

        sc.close();
    }

    public static int[] checkRepetition(int[] numbers) {
        int[] withNoRepetition = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            withNoRepetition[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyExists = false;
            for (int j = 0; j < count; j++) {
                if (numbers[i] == withNoRepetition[j]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                withNoRepetition[count] = numbers[i];
                count++;
            }
        }

        return withNoRepetition;
    }

    public static void printNumbers (int[] withNoRepetition) {
        for (int i = 0; i < withNoRepetition.length; i++) {
            if (withNoRepetition[i] != Integer.MIN_VALUE) {
                System.out.println(withNoRepetition[i]);
            }
            else {
                break;
            }
        }
    }
}
