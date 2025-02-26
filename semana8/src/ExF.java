import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {
        financialInvestment();
    }

    public static void financialInvestment() {
        Scanner sc = new Scanner(System.in);

        double[] bankRates = new double[6];
        double actualRate;
        double initialDeposit;

        for (int i = 0; i < bankRates.length; i++) {
            actualRate = sc.nextDouble();
            bankRates[i] = actualRate;
        }

        initialDeposit = sc.nextDouble();

        simuleFinancialInvestment(bankRates, initialDeposit);

        sc.close();
    }

    public static void simuleFinancialInvestment(double[] bankRates, double initialDeposit) {
        double actualValue = initialDeposit;

        for (int i = 0; i < bankRates.length; i++) {
            actualValue = actualValue + (actualValue * bankRates[i]);
        }

        System.out.printf("final value=%.2f\n", actualValue);
    }
}
