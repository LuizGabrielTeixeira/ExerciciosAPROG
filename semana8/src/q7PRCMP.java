public class q7PRCMP {
    static int positive = 43; // put a positive number here
    static int negative = -63; // put a negative number here

    public static void printDecimalWithSignal(int number) {
        if (number > 0) {
            System.out.printf("+%d\n", number);
        } else {
            System.out.printf("%d\n", number);
        }
    }


    public static void printDecimalWithoutSignal(int number) {
        if (number < 0) {
            number = -number; // because the negative number is stored with a sign in two's complement
        }
        System.out.printf("%d\n", number);
    }


    public static char verifyHexdecimal(int number) {
        if (number < 10) {
            return (char) ('0' + number);
        } else {
            return (char) ('A' + (number - 10)); //in hexadecimal, A is 10,..., F is 15.
        }
    }


    public static void printHexadecimal(int number) {
        char[] result = new char[20];
        int i = 0;

        if (number < 0) {
            number = -number;
        }

        if (number == 0) {
            System.out.print("0\n");
            return;
        }

        while (number > 0) {
            int digit = number % 16;
            result[i++] = verifyHexdecimal(digit);
            number = number / 16;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.printf("%c", result[j]);
        }

        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Decimal with signal:");
        printDecimalWithSignal(positive);
        printDecimalWithSignal(negative);

        System.out.println("Decimal without signal:");
        printDecimalWithoutSignal(positive);
        printDecimalWithoutSignal(negative);

        System.out.println("Hexadecimal:");
        printHexadecimal(positive);
        printHexadecimal(negative);
    }
}
