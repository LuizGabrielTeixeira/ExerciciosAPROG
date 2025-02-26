import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ExJ {
    public static final int MAX_EMPLOYEES = 35;
    public static final int TOP_THREE = 3;

    public static void main(String[] args) {
        reedSalaries();
    }

    private static void reedSalaries() {
        Scanner sc = new Scanner(System.in);

        int peopleCount = 0;
        String salary;
        String name;

        String[][] salariesAndNames = new String[MAX_EMPLOYEES][2];


        for (int i = 0; i < salariesAndNames.length; i++) {
            name = sc.nextLine();

            if (name.equalsIgnoreCase("end")) {
                break;
            }

            salary = sc.nextLine();

            salariesAndNames[i][0] = salary;
            salariesAndNames[i][1] = name;

            peopleCount++;
        }

        sortSalaries(salariesAndNames, peopleCount);
        sortNames(salariesAndNames, peopleCount);
        printTopThree(salariesAndNames, peopleCount);

        sc.close();
    }

    public static void sortSalaries(String[][] salariesAndNames, int peopleCount) {
        String temporarySalary;
        String temporaryName;

        for (int i = 0; i < peopleCount - 1; i++) {
            for (int j = 0; j < peopleCount - i - 1; j++) {
                if (parseDouble(salariesAndNames[j][0]) < parseDouble(salariesAndNames[j + 1][0])) {
                    temporarySalary = salariesAndNames[j][0];
                    temporaryName = salariesAndNames[j][1];

                    salariesAndNames[j][0] = salariesAndNames[j + 1][0];
                    salariesAndNames[j][1] = salariesAndNames[j + 1][1];

                    salariesAndNames[j + 1][0] = temporarySalary;
                    salariesAndNames[j + 1][1] = temporaryName;
                }
            }
        }
    }

    public static void sortNames(String[][] salariesAndNames, int peopleCount) {
        String temporarySalary;
        String temporaryName;

        for (int i = 0; i < peopleCount - 1; i++) {
            for (int j = 0; j < peopleCount - i - 1; j++) {
                if (parseDouble(salariesAndNames[j][0]) == parseDouble(salariesAndNames[j + 1][0])) {
                    int equalsResult = salariesAndNames[j][1].compareToIgnoreCase(salariesAndNames[j + 1][1]);
                    if (equalsResult > 0) {
                        temporarySalary = salariesAndNames[j][0];
                        temporaryName = salariesAndNames[j][1];

                        salariesAndNames[j][0] = salariesAndNames[j + 1][0];
                        salariesAndNames[j][1] = salariesAndNames[j + 1][1];

                        salariesAndNames[j + 1][0] = temporarySalary;
                        salariesAndNames[j + 1][1] = temporaryName;
                    }
                }
            }
        }
    }

    private static void printTopThree(String[][] salariesAndNames, int peopleCount) {
        for (int i = 0; i < peopleCount && i < TOP_THREE; i++) {
            System.out.printf("#%d:%s:%s\n", i + 1, salariesAndNames[i][1], salariesAndNames[i][0]);
        }
    }
}
