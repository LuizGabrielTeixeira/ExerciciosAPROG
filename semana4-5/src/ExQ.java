import java.util.Scanner;

public class ExQ {
    public static void main(String[] args) {
        imprimirSkills();
    }

    public static void imprimirSkills() {
        Scanner scanner = new Scanner(System.in);

        int skills = scanner.nextInt();
        int conjuntoSkills = 0;

        if (skills > 0) {
            while (skills > 0) {
                int skillsInvertidas = inverterSkills(skills);
                int digitoSkills;

                if (conjuntoSkills == 0) {
                    conjuntoSkills = conjuntoSkills + skills;
                } else {
                    while (skillsInvertidas > 0) {
                        digitoSkills = skillsInvertidas % 10;
                        skillsInvertidas /= 10;

                        if (!verificarExistenciaSkill(conjuntoSkills, digitoSkills)) {
                            conjuntoSkills = conjuntoSkills * 10 + digitoSkills;
                        }
                    }
                }
                skills = scanner.nextInt();
            }

            System.out.println(conjuntoSkills);
        } else {
            scanner.close();
        }
    }

    public static boolean verificarExistenciaSkill(int conjuntoSkills, int digitoSkillsInvertida) {
        boolean continhaSkill = false;
        int digitoConjuntoSkills;

        for (int i = conjuntoSkills; i > 0 && !continhaSkill; i /= 10) {
            digitoConjuntoSkills = i % 10;

            if (digitoConjuntoSkills == digitoSkillsInvertida) {
                continhaSkill = true;
            }
        }

        return continhaSkill;
    }

    public static int inverterSkills(int numero) {
        int digitoSkills;
        int skillsInvertidas = 0;

        while (numero > 0) {
            digitoSkills = numero % 10;
            numero /= 10;
            skillsInvertidas = skillsInvertidas * 10 + digitoSkills;
        }

        return skillsInvertidas;
    }
}
