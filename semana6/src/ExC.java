import java.util.Scanner;

public class ExC {
    static final int QUADRADO = 2;

    public static void main(String[] args) {
        calcularTriangulo();
    }

    public static void calcularTriangulo() {
        Scanner scanner = new Scanner(System.in);
        double ladoA = scanner.nextDouble();
        double ladoB = scanner.nextDouble();
        double ladoC = scanner.nextDouble();
        double angulo1;
        double angulo3;
        double angulo2;

        if (ladoA <= 0 && ladoB <= 0 && ladoC <= 0) {
            System.out.println("impossible");
        } else if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {

            angulo1 = calcularAngulos(ladoA, ladoB, ladoC);
            angulo2 = calcularAngulos(ladoA, ladoC, ladoB);
            angulo3 = calcularAngulos(ladoB, ladoC, ladoA);


            System.out.printf("a=%.2f\nb=%.2f\nc=%.2f\n", ladoA, ladoB, ladoC);
            System.out.printf("ang(a,b)=%.2f\nang(a,c)=%.2f\nang(b,c)=%.2f\n", angulo1, angulo2, angulo3);
        } else {
            System.out.println("impossible");
        }
        scanner.close();
    }

    public static double calcularAngulos(double lado1, double lado2, double lado3) {
        double valorCosseno;
        double anguloRadiano;
        double anguloGrau;

        valorCosseno = (Math.pow(lado1, QUADRADO) + Math.pow(lado2, QUADRADO) - Math.pow(lado3, QUADRADO)) / (2 * lado1 * lado2);
        anguloRadiano = Math.acos(valorCosseno);
        anguloGrau = Math.toDegrees(anguloRadiano);


        return anguloGrau;
    }
}
