import java.util.Scanner;

public class ExM {
    public static void main(String[] args) {
        differentDigits();
    }

    public static void differentDigits() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[100];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[counter] = sc.nextInt();
            if (numbers[counter] < 0) {
                break;
            } else {
                counter++;
            }
        }

        int[][] numbersAndDigits = countDigits(numbers, counter);
        int[][] checkedDifferentDigits = checkDiffDigits(numbersAndDigits);

        for (int i = 0; i < checkedDifferentDigits.length; i++) {
            System.out.printf("%d:%d\n", checkedDifferentDigits[i][0], checkedDifferentDigits[i][1]);
        }

        sc.close();
    }

    public static int[][] countDigits(int[] numbers, int counter) {
        int[][] numbersAndDigits = new int[counter][2];

        for (int i = 0; i < counter; i++) {
            if (numbers[i] < 10 && numbers[i] > -1) {
                numbersAndDigits[i][0] = numbers[i];
                numbersAndDigits[i][1] = 1;
            } else {
                int temp = numbers[i];
                numbersAndDigits[i][0] = numbers[i];
                while (temp > 0) {
                    temp /= 10;
                    numbersAndDigits[i][1]++;
                }
            }
        }

        return numbersAndDigits;
    }

    public static int[][] checkDiffDigits(int[][] numbersAndDigits) {
        int[][] checkedDifferentDigits = new int[numbersAndDigits.length][2];

        for (int i = 0; i < numbersAndDigits.length; i++) {
            int number = numbersAndDigits[i][0];
            boolean[] digits = new boolean[10];
            int differentDigitsCount = 0;

            while (number > 0) {
                int digit = number % 10;
                if (!digits[digit]) {
                    digits[digit] = true;
                    differentDigitsCount++;
                }
                number /= 10;
            }

            checkedDifferentDigits[i][0] = numbersAndDigits[i][0];
            checkedDifferentDigits[i][1] = differentDigitsCount;
        }

        return checkedDifferentDigits;
    }
}
