import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {
        invertSequence();
    }

    public static void invertSequence (){
        Scanner sc = new Scanner(System.in);

        int quantityOfNumbers = sc.nextInt();
        int[] numbers = new int[quantityOfNumbers];

        for (int i = 0; i < quantityOfNumbers; i++) {
            numbers[i] = sc.nextInt();
        }

        invertAndPrintSequence(numbers);
    }

    public static void invertAndPrintSequence(int[] numbers){
        for (int i = numbers.length -1; i > -1 ; i--) {
            System.out.printf("%d\n", numbers[i]);
        }
    }
}
