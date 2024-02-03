package pl.edu.wsiz.io13.part2;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    void add(Employee employee) {
        this.employees.add(employee);
    }

    void printEmployees() {
        System.out.println("--------------------");

        for (Employee employee : employees) {
            int index = employees.indexOf(employee);
            System.out.print(index + 1 + "  ");
            employee.print();
        }

        System.out.println("--------------------");
    }
}
