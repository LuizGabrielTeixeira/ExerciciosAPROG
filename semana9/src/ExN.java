import java.util.Scanner;

public class ExN {
    public static void main(String[] args) {
        diagonals();
    }

    public static void diagonals() {
        Scanner sc = new Scanner(System.in);

        int matrixOrder = sc.nextInt();

        if (matrixOrder > 1 && matrixOrder < 20) {
            int[][] matrix = new int[matrixOrder][matrixOrder];

            for (int i = 0; i < matrixOrder; i++) {
                for (int j = 0; j < matrixOrder; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            printDiagonals(matrix, matrixOrder);

        } else {
            System.out.println("The matrix order must be greater than 1 and less than 20.");
        }

        sc.close();
    }

    public static void printDiagonals(int[][] matrix, int matrixOrder) {
        for (int d = matrixOrder - 1; d >= 0; d--) {
            for (int i = 0, j = d; j < matrixOrder; i++, j++) {
                System.out.printf("[%d]", matrix[i][j]);
            }
            System.out.println();
        }

        for (int d = 1; d < matrixOrder; d++) {
            for (int i = d, j = 0; i < matrixOrder; i++, j++) {
                System.out.printf("[%d]", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
