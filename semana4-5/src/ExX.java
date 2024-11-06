import java.util.Scanner;

public class ExX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();

        if (codigo >= 1 && codigo <= 6) {
            switch (codigo) {
                case 1:
                    System.out.println("Tag Heuer");
                    break;
                case 2:
                    System.out.println("Rolex");
                    break;
                case 3:
                    System.out.println("Omega");
                    break;
                case 4:
                    System.out.println("Cartier");
                    break;
                case 5:
                    System.out.println("Bvlgari");
                    break;
                case 6:
                    System.out.println("Raymond Weil");
                    break;
            }
        } else {
            System.out.println("Invalid brand");
        }
        scanner.close();
    }
}
