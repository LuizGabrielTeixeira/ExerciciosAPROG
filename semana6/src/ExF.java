import java.util.Locale;
import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {
        volumeSolidosRevolucao();
    }

    public static void volumeSolidosRevolucao() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String figura = scanner.next();

        while (!figura.equals("end")) {
            double raio = scanner.nextDouble(),altura;
            switch (figura) {
                case "sphere":
                    calcularVolumeEsfera(raio);
                    break;

                case "cylinder":
                    altura = scanner.nextDouble();
                    calcularVolumeCilindro(raio, altura);
                    break;

                case "cone":
                    altura = scanner.nextDouble();
                    calcularVolumeCone(raio, altura);
                    break;
            }
            figura = scanner.next();
        }


        scanner.close();
    }

    public static void calcularVolumeEsfera(double raio) {
        double volumeEsfera = 4.0 / 3.0 * Math.PI * Math.pow(raio, 3);

        System.out.printf("%.2f\n", volumeEsfera);
    }

    public static void calcularVolumeCilindro(double raio, double altura) {
        double volumeCilindro = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("%.2f\n", volumeCilindro);
    }

    public static void calcularVolumeCone(double raio, double altura) {

        double volumeCone = 1.0 / 3.0 * Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("%.2f\n", volumeCone);
    }
}
