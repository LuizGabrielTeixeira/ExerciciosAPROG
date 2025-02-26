import java.util.Scanner;

public class ExI {
    public static void main(String[] Args) {
        condominium();
    }

    public static void condominium() {
        Scanner sc = new Scanner(System.in);

        String[][] condominium = new String[4][3];

        String name;
        String nameForSearch;

        for (int j = 0; j < condominium[0].length; j++) {
            for (int i = 0; i < condominium.length; i++) {
                name = sc.nextLine();
                condominium[i][j] = name;
            }
        }

        nameForSearch = sc.nextLine();

        boolean[][] founds = searchName(condominium, nameForSearch);
        printFounds(founds, condominium);

        sc.close();
    }

    public static void printFounds(boolean[][] founds, String[][] condominium) {
        boolean noOneFound = true;

        for (int j = 0; j < condominium[0].length; j++) {
            for (int i = 0; i < condominium.length; i++) {
                if (founds[i][j]) {
                    System.out.println("name=" + condominium[i][j]);
                    System.out.println("entrance=" + j);
                    System.out.println("floor=" + i);
                    noOneFound = false;
                    break;
                }
            }
        }
        if (noOneFound) {
            System.out.println("Do not live in the building");
        }

    }

    public static boolean[][] searchName(String[][] condominium, String nameForSearch) {
        boolean[][] founds = new boolean[4][3];

        for (int j = 0; j < condominium[0].length; j++) {
            for (int i = 0; i < condominium.length; i++) {
                String actualName = condominium[i][j];
                if (actualName.equalsIgnoreCase(nameForSearch)) {
                    founds[i][j] = true;
                    break;
                }
            }
        }
        return founds;
    }
}

