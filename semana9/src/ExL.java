import java.util.Scanner;

public class ExL {
    public static void main(String[] args) {
        neighbours();
    }

    private static void neighbours() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[1000];
        int counter = 0;

        for (int i = 0; - 1 < numbers[i]; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0) {
                break;
            } else {
                counter++;
            }
        }

        printLargerThanNeighbours(numbers, counter);

        sc.close();
    }

    public static void printLargerThanNeighbours (int[] numbers, int counter) {
        for (int i = 1; i < counter - 1; i++) {
            if (numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                System.out.println(numbers[i]);
            }
        }
    }
}
