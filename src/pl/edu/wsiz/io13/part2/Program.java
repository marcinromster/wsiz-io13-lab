package pl.edu.wsiz.io13.part2;

public class Program {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.firstname = "Jan";
        employee.lastname = "Kowalski";
        employee.age = 30;

        System.out.printf("Employee: %s %s %d", employee.firstname, employee.lastname, employee.age);
    }
}
