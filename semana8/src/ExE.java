import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
        salaryStatistics();
    }

    private static void salaryStatistics() {
        Scanner scanner = new Scanner(System.in);

        String name;
        double salary;

        double[] salaries = new double[20];
        String[] names = new String[20];

        int peopleCount = 0;

        for (int i = 0; i < salaries.length; i++) {
            name = scanner.next();

            if (name.equalsIgnoreCase("end")) {
                break;
            }

            salary = scanner.nextDouble();

            names[i] = name;
            salaries[i] = salary;
            peopleCount++;
        }

        double averageSalary = averageSalary(salaries, peopleCount);
        salariesUnderAverage(salaries, names, averageSalary, peopleCount);

        scanner.close();
    }

    private static void salariesUnderAverage(double[] salaries, String[] names, double averageSalary, int peopleCount) {
        for (int i = 0; i < peopleCount; i++) {
            if (salaries[i] < averageSalary) {
                System.out.printf("%s\n", names[i]);
            }
        }
    }

    private static double averageSalary(double[] salaries, int peopleCount) {
        double averageSalary;
        double sum = 0;

        for (int i = 0; i < peopleCount; i++) { // The peopleCount here is the "limit" of the necessary array.
            sum += salaries[i];
        }

        averageSalary = sum / peopleCount;

        System.out.printf("%.1f\n", averageSalary);

        return averageSalary;
    }
}