import java.util.Scanner;

public class ExO {
    public static void main(String[] args) {
        quadrants();
    }

    public static void quadrants() {
        Scanner sc = new Scanner(System.in);

        int matrixOrder = sc.nextInt();

        if (matrixOrder > 1 && matrixOrder <= 20) {

            int[][] matrix = new int[matrixOrder][matrixOrder];

            for (int i = 0; i < matrixOrder; i++) {
                for (int j = 0; j < matrixOrder; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            if (matrix.length == 2) {
                System.out.printf("[%d][%d]\n[%d][%d]\n", matrix[0][0], matrix[0][1], matrix[1][0], matrix[1][1]);
            } else {
                int[] quadrants = calculeQuadrants(matrix);

                System.out.printf("[%d][%d]\n[%d][%d]\n", quadrants[1], quadrants[0], quadrants[2], quadrants[3]);
            }
        } else {
            System.out.println("The matrix order must be between 2 and 20.");
        }
        sc.close();
    }

    public static int[] calculeQuadrants(int[][] matrix) {
        int[] quadrants = new int[4];

        int halfOrder = matrix.length / 2;

        if (halfOrder % 2 == 0 && matrix.length != 2) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i < halfOrder && j >= halfOrder) {
                        quadrants[0] += matrix[i][j];
                    } else if (i < halfOrder) {
                        quadrants[1] += matrix[i][j];
                    } else if (j < halfOrder) {
                        quadrants[2] += matrix[i][j];
                    } else {
                        quadrants[3] += matrix[i][j];
                    }
                }
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (i < halfOrder && j > halfOrder) {
                        quadrants[0] += matrix[i][j];
                    } else if (i < halfOrder && j < halfOrder) {
                        quadrants[1] += matrix[i][j];
                    } else if (i > halfOrder && j < halfOrder) {
                        quadrants[2] += matrix[i][j];
                    } else if (i > halfOrder && j > halfOrder) {
                        quadrants[3] += matrix[i][j];
                    }
                }
            }
        }

        return quadrants;
    }
}
