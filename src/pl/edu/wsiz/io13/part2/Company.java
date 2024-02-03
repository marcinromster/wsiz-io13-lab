package pl.edu.wsiz.io13.part2;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    boolean employeeExists(Employee newEmployee) {
        for (Employee employee : employees) {
            if (employee.isEqual(newEmployee)) {
                return true;
            }
        }

        return false;
    }

    void add(Employee newEmployee) {
        boolean exists = this.employeeExists(newEmployee);
        if (exists) {
            System.out.println("Pracownik o tych samych danych znajduje się już na liście!");
            return;
        }

        this.employees.add(newEmployee);
    }

    void add() {
        Employee employee = Employee.read();
        this.add(employee);
    }

    void printEmployees() {
        System.out.println("--------------------");

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.print(i + 1 + "  ");
            employee.print();
        }

/*
        rozwiązanie alternatywne 1

        for (Employee employee : employees) {
            int index = employees.indexOf(employee);
            System.out.print(index + 1 + "  ");
            employee.print();
        }

        rozwiązanie alternatywne 2

        int index = 1;
        for (Employee employee : employees) {
            System.out.print(index++ + "  ");
            employee.print();
        }
*/

        System.out.println("--------------------");
    }

    void removeEmployee(int employeeNumber) {
        if (employeeNumber < 1 || employeeNumber > employees.size()) {
            System.out.println("Lista nie zawiera pracownika o podanym numerze porządkowym.");
            return;
        }

        employees.remove(employeeNumber - 1);
    }
}
