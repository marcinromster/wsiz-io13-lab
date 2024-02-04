package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Employee {
    private final String firstname;
    private final String lastname;
    private final byte age;
    private final Sex sex;
    private final int salary;

    Employee(String firstname, String lastname, byte age, Sex sex, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    void print() {
        String sexStr = sex == Sex.FEMALE ? "K" : "M";
        System.out.printf("%s %s %d %s %dzł\n", firstname, lastname, age, sexStr, salary);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię:      ");
        String firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        String lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        byte age = scanner.nextByte();

        System.out.print("Podaj płeć:      ");
        String sexStr = scanner.next();
        Sex sex = sexStr.toUpperCase().charAt(0) == 'K' ? Sex.FEMALE : Sex.MALE;

        System.out.print("Podaj zarobki:   ");
        int salary = scanner.nextInt();

        return new Employee(firstname, lastname, age, sex, salary);
    }

    public boolean isEqual(Employee otherEmployee) {
        return this.firstname.equalsIgnoreCase(otherEmployee.firstname)
                && this.lastname.equalsIgnoreCase(otherEmployee.lastname)
                && this.age == otherEmployee.age
                && this.sex == otherEmployee.sex;
    }
}
