package pl.edu.wsiz.io13.part2;

public class Employee {
    String firstname;
    String lastname;
    byte age;

    void print() {
        System.out.printf("Employee: %s %s %d", firstname, lastname, age);
    }
}
