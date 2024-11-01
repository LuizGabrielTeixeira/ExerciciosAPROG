package semana4_5;

import java.util.Scanner;

public class ExI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int div = 2;
        int mmc = 1;
        while (numero1 > 1 || numero2 > 1){
            if (numero1 % div == 0 || numero2 % div == 0){
                mmc = mmc * div;
                if (numero1 % div == 0){
                    numero1 = numero1 / div;
                }
                if (numero2 % div == 0){
                    numero2 = numero2 / div;
                }
            }
            else {
                div++;
            }
        }
        System.out.println(mmc);
    }
}
