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

        for (Employee employee : employees) {
            int index = employees.indexOf(employee);
            System.out.print(index + 1 + "  ");
            employee.print();
        }

        System.out.println("--------------------");
    }
}
