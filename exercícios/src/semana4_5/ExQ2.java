package semana4_5;

import java.util.Scanner;

public class ExQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conjuntoSkills = 0;
        int skills = scanner.nextInt();
        int copiaSkills;
        int digitoSkills;
        int skillsInvertidas;
        int digitoSkillsInvertidas;
        int digitoConjuntoSkills;
        boolean continhaSkill;

        while (skills > 0) {
            copiaSkills = skills;
            skillsInvertidas = 0;

            while (copiaSkills > 0) {
                digitoSkills = copiaSkills % 10;
                copiaSkills /= 10;
                skillsInvertidas = skillsInvertidas * 10 + digitoSkills;
            }

            if (conjuntoSkills == 0) {
                conjuntoSkills = skills;
            } else {
                while (skillsInvertidas > 0) {
                    digitoSkillsInvertidas = skillsInvertidas % 10;
                    skillsInvertidas /= 10;
                    continhaSkill = false;

                    for (int i = conjuntoSkills; i > 0 && !continhaSkill; i /= 10) {
                        digitoConjuntoSkills = i % 10;

                        if (digitoConjuntoSkills == digitoSkillsInvertidas) {
                            continhaSkill = true;
                        }
                    }

                    if (!continhaSkill) {
                        conjuntoSkills = conjuntoSkills * 10 + digitoSkillsInvertidas;
                    }
                }
            }
            skills = scanner.nextInt();
        }

        if (conjuntoSkills != 0) {
            System.out.println(conjuntoSkills);
        } else {
            System.out.println();
        }

        scanner.close();
    }
}