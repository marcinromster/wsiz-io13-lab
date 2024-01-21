package pl.edu.wsiz.io13.part2;

import java.util.Scanner;

public class Employee {
    String firstname;
    String lastname;
    byte age;

    void print() {
        System.out.printf("%s %s %d\n", firstname, lastname, age);
    }

    static Employee read() {
        Scanner scanner = new Scanner(System.in);
        Employee tmpEmployee = new Employee();

        System.out.print("Podaj imię:      ");
        tmpEmployee.firstname = scanner.next();

        System.out.print("Podaj nazwisko:  ");
        tmpEmployee.lastname = scanner.next();

        System.out.print("Podaj wiek:      ");
        tmpEmployee.age = scanner.nextByte();

        return tmpEmployee;
    }
}
