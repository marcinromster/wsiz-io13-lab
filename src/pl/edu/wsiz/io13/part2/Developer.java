package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Developer extends Employee {
    Developer(String firstname, String lastname, byte age, Sex sex, int salary, String[] skills) {
        super(firstname, lastname, age, sex, salary, skills);
    }

    void print() {
        System.out.print("P ");
        super.print();
    }

    static Developer read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:         ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:     ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:         ");
        byte age = scanner.nextByte();

        System.out.print("Podaj płeć:         ");
        String sexStr = scanner.next();
        Sex sex = sexStr.toUpperCase().charAt(0) == 'K' ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:      ");
        int salary = scanner.nextInt();

        System.out.print("Podaj umiejętności: ");
        scanner.nextLine();
        String skillsStr = scanner.nextLine();
        String[] skillsArr = skillsStr.split(",");
        for (int i = 0; i < skillsArr.length; i++) {
            skillsArr[i] = skillsArr[i].trim();
        }

        return new Developer(firstname, lastname, age, sex, salary, skillsArr);
    }
}
